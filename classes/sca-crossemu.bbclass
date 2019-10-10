## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit qemu
inherit sca-crossemu-image

DEPENDS += "proot-native qemu-static-native"

def sca_crossemu(d, cmd, addpkgs, toolname, postcmd="", subprocargs={}):
    import subprocess
    import os

    _target_path = do_sca_create_crossemu_img(d, toolname, addpkgs, postcmd)

    os.environ["PSEUDO_UNLOAD"] = "1"
    os.environ["SHELL"] = "/bin/bash"
    os.environ["PATH"] = os.environ["PATH"] + ":/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
    _args = ["{}/proot".format(d.getVar("STAGING_BINDIR_NATIVE")), "-r", _target_path, "--root-id"]
    _targs = ["/{}-static".format(qemu_target_binary(d))]
    if isinstance(cmd, str):
        cmd = cmd.split(" ")
    _targs += cmd
    cmd_output = ""
    try:
        cmd_output = subprocess.check_output(_args + _targs, stderr=subprocess.STDOUT, **subprocargs)
    except subprocess.CalledProcessError as e:
        cmd_output = e.stdout or ""
    return cmd_output
    