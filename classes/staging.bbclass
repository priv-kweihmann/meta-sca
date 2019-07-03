def get_path_in_other_layer(d, _file):
    import glob
    ## Find out if we need to inherit the core-class or not
    tmp = d.getVar("BBLAYERS") or ""
    for item in tmp.split(" "):
        if not item.strip():
            continue
        chunks = _file.split("/")
        res = glob.glob(item.strip() + "/**/{}".format(chunks[-1]), recursive=True)
        if not res:
            res = glob.glob(item.strip() + "/{}".format(_file))
        res = [x for x in res or [] if not x.endswith("meta-sca/classes/staging.bbclass")]
        if any(res):
            return res[0]
    return ""

def get_path_for_layer(d, name):
    tmp = d.getVar("BBLAYERS") or ""
    for item in tmp.split(" "):
        if not item.strip():
            continue
        _chunks = [x for x in item.split("/") if x]
        if _chunks[-1] == name:
            return item
    return ""

def get_rel_path(d, _file):
    import os
    res = ""
    x = get_path_in_other_layer(d, _file)
    if x:
        res = os.path.relpath(x, os.path.dirname(os.path.join(get_path_for_layer(d, "meta-sca"), "classes/staging.bbclass")))
    else:
        raise Exception("Can't find poky-staging.bbclass - Can't proceed")
    return res

require ${@get_rel_path(d, "meta/classes/staging.bbclass")}

## This class does override parts of the original poky implementation
## of staging.bbclass
## Changes:
## - Ignore FileNotFoundError and FileExistsError error on linking
##

def staging_copyfile(c, target, dest, postinsts, seendirs):
    import errno

    destdir = os.path.dirname(dest)
    if destdir not in seendirs:
        bb.utils.mkdirhier(destdir)
        seendirs.add(destdir)
    if "/usr/bin/postinst-" in c:
        postinsts.append(dest)
    if os.path.islink(c):
        linkto = os.readlink(c)
        if os.path.lexists(dest):
            if not os.path.islink(dest):
                raise OSError(errno.EEXIST, "Link %s already exists as a file" % dest, dest)
            if os.readlink(dest) == linkto:
                return dest
            raise OSError(errno.EEXIST, "Link %s already exists to a different location? (%s vs %s)" % (dest, os.readlink(dest), linkto), dest)
        os.symlink(linkto, dest)
        #bb.warn(c)
    else:
        try:
            os.link(c, dest)
        except (FileNotFoundError, FileExistsError):
            pass
        except OSError as err:
            if err.errno == errno.EXDEV:
                bb.utils.copyfile(c, dest)
            else:
                raise
    return dest
