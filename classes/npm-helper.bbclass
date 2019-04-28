## This file contain some npm helper functions

DEPENDS += "nodejs-native"

def npm_check_package(d, path, name, version):
    import os
    import json
    import shutil
    if not os.path.exists(os.path.join(path, "node_modules", name, "package.json")):
        return False
    j = {}
    with open(os.path.join(path, "node_modules", name, "package.json")) as i:
        j = json.load(i)
    if j["version"] != version:
        ## delete the folder
        shutil.rmtree(os.path.join(path, "node_modules", name))
        return False
    return True

def npm_install_package(d, path, name, version):
    import subprocess
    bb.note("Check on npm-install of {}@{}".format(name, version))
    if npm_check_package(d, path, name, version):
        return
    bb.note("Install npm-package {}@{}".format(name, version))
    try:
        subprocess.check_call(["npm", "--prefix", path, "install", "{}@{}".format(name, version)], universal_newlines=True)
    except subprocess.CalledProcessError as e:
        bb.error("Install npm-package {}@{} failed: {}".format(name, version, e))

def npm_postinst_fix_paths(d, path, name, template="%SYSROOT%"):
    import os
    for folder, dirs, files in os.walk(path):
        for _file in files:
            if _file.endswith('.json'):
                fullpath = os.path.join(folder, _file)
                content = ""
                with open(fullpath, 'r') as f:
                    content = f.read().replace(d.getVar("B"), "{}/{}".format(template, name))
                with open(fullpath, "w") as f:
                    f.write(content)

def npm_prerun_fix_paths(d, path, name, template="%SYSROOT%"):
    import glob
    import os

    ## Rewrite all of the packages-paths if we have to
    for item in glob.glob(os.path.join(path, name) + "/**/package.json", recursive=True):
        content = ""
        with open(item, "r") as i:
            content = i.read().replace(template, path)
        with open(item, "w") as o:
            o.write(content)