import hashlib
import json
import os
import re
import subprocess
import tarfile
import tempfile
import shutil


def __get_from_file(tarball):
    _lic_path = ""
    _lic_hash = ""
    _potential_files = [x for x in tarball.getnames() if re.match(
        r"^(.*/)*(license.*|copying.*|licence.*|.*-license)", x, re.IGNORECASE)]
    if _potential_files:
        try:
            _l = tarball.extractfile(_potential_files[0])
            _lic_path = os.path.join(
                "/tmp", os.path.basename(_potential_files[0]))
            with open(_lic_path, "wb") as o:
                o.write(_l.read())
            hash_md5 = hashlib.md5()
            with open(_lic_path, "rb") as f:
                for chunk in iter(lambda: f.read(4096), b""):
                    hash_md5.update(chunk)
            _lic_hash = hash_md5.hexdigest()
        except:
            _lic_path = ""
            _lic_hash = ""
    return (os.path.basename(_lic_path), _lic_hash)


def __get_from_scancode(tarball, excludes):
    _dir = tempfile.mkdtemp()
    _l = tarball.extractall(path=_dir)

    try:
        subprocess.check_call(
            ["scancode", "--license", "--strip-root", "--quiet", "--json", "/tmp/scancode.res.json", "-n", "8", _dir], stderr=subprocess.DEVNULL)
    except:
        pass

    res = {}
    with open("/tmp/scancode.res.json") as i:
        j = json.load(i)
        for f in j["files"]:
            if any([re.match(x, f["path"]) for x in excludes]):
                continue
            for l in f["licenses"]:
                if f["path"] not in res:
                    res[f["path"]] = {"start": 99999999999, "end": -1}
                res[f["path"]]["start"] = min(
                    res[f["path"]]["start"], l["start_line"])
                res[f["path"]]["end"] = max(res[f["path"]]["end"], l["end_line"])

    _lic_path = ""
    _lic_hash = ""
    if res:
        for k,v in res.items():
            _lic_path = k
            hash_md5 = hashlib.md5()
            with open(os.path.join(_dir, _lic_path), "r") as f:
                _lines = "".join(f.readlines()[v["start"]-1:v["end"]])
                hash_md5.update(_lines.encode('utf-8'))
            _lic_hash = hash_md5.hexdigest()
            _lic_path += ";beginline={};endline={}".format(v["start"], v["end"])

    shutil.rmtree(_dir, ignore_errors=True)
    return (_lic_path, _lic_hash)


def get_license_info(tarball, excludes=[]):
    _lic_path, _lic_hash = __get_from_file(tarball)
    if _lic_path:
        return (_lic_path, _lic_hash)
    _lic_path, _lic_hash = __get_from_scancode(tarball, excludes)
    if _lic_path:
        return (_lic_path, _lic_hash)
    return ("TODO", None)
