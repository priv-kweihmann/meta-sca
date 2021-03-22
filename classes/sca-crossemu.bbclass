## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit qemu
inherit sca-crossemu-image

DEPENDS += "proot-native qemu-static-native"

SCA_CROSSEMU_LOCK = "${TMPDIR}/crossemu.lock"
PSEUDO_IGNORE_PATHS .= "${WORKDIR}/temp_,${WORKDIR}/work_"

def sca_crossemu(d, cmd, addpkgs, toolname, postcmd="", subprocargs={}, addargs=[]):

    import subprocess
    import os

    with bb.utils.fileslocked([d.expand("${SCA_CROSSEMU_LOCK}")]):

        _target_path = do_sca_create_crossemu_img(d, toolname, addpkgs, postcmd)

        cmd_output = ""
        if cmd:
            os.environ["PSEUDO_UNLOAD"] = "1"
            os.environ["SHELL"] = "/bin/bash"
            os.environ["PATH"] = os.environ["PATH"] + ":/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
            _args = ["{}/proot".format(d.getVar("STAGING_BINDIR_NATIVE")), "-r", _target_path, "--root-id"] + addargs
            _targs = ["/{}-static".format(qemu_target_binary(d))]
            if isinstance(cmd, str):
                cmd = cmd.split(" ")
            _targs += cmd
            try:
                cmd_output = subprocess.check_output(_args + _targs, stderr=subprocess.STDOUT, **subprocargs)
            except subprocess.CalledProcessError as e:
                cmd_output = e.stdout or ""
            __debug_chunk = min(1024, len(str(cmd_output))) - 1
            sca_log_note(d, str(cmd_output)[0:__debug_chunk])
        return (cmd_output, _target_path)
