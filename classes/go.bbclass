## SPDX-License-Identifier: BSD-2-Clause AND MIT
## Copyright (c) 2020, Konrad Weihmann
## COpyright (c) 2019, Yocto project

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
        res = [x for x in res or [] if not x.endswith("meta-sca/classes/go.bbclass")]
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
        res = os.path.relpath(x, os.path.dirname(os.path.join(get_path_for_layer(d, "meta-sca"), "classes/go.bbclass")))
    else:
        raise Exception("Can't find poky-go.bbclass - Can't proceed")
    return res

require ${@get_rel_path(d, "meta/classes/go.bbclass")}

## This add the missing GOCACHE setting
export GOCACHE = "${B}/.cache"
## Add missing exports of env vars
export GOARCH = "${TARGET_GOARCH}"
export GOOS = "${TARGET_GOOS}"
export GOHOSTARCH="${BUILD_GOARCH}"
export GOHOSTOS="${BUILD_GOOS}"

GOARM[export] = "0"
GOARM_arm_class-target = "${TARGET_GOARM}"
GOARM_arm_class-target[export] = "1"

GO386[export] = "0"
GO386_x86_class-target = "${TARGET_GO386}"
GO386_x86_class-target[export] = "1"

GOMIPS[export] = "0"
GOMIPS_mips_class-target = "${TARGET_GOMIPS}"
GOMIPS_mips_class-target[export] = "1"
