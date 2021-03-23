## SPDX-License-Identifier: BSD-2-Clause
## SPDX-License-Identifier: MIT
## as parts of the class are taken from official poky
## Copyright (c) 2019, Konrad Weihmann

inherit qemu
inherit sca-crossemu-image

DEPENDS += "proot-native qemu-static-native"

SCA_CROSSEMU_LOCK = "${TMPDIR}/crossemu.lock"
PSEUDO_IGNORE_PATHS .= "${WORKDIR}/temp_,${WORKDIR}/work_"

do_sca_crossemu_flush_pseudodb() {
    # clearout pseudo DB
	${FAKEROOTENV} ${FAKEROOTCMD} -S
}

def sca_crossemu(d, cmd, addpkgs, toolname, postcmd="", subprocargs={}, addargs=[]):

    import subprocess
    import os

    sca_log_note(d, "crossqemu: {} - pre-lock".format(toolname))

    with bb.utils.fileslocked([d.expand("${SCA_CROSSEMU_LOCK}")]):

        sca_log_note(d, "crossqemu: {} - post-lock".format(toolname))

        # explicitly flush the pseudo DB
        bb.build.exec_func("do_sca_crossemu_flush_pseudodb", d)

        _target_path = do_sca_create_crossemu_img(d, toolname, addpkgs, postcmd)

        sca_log_note(d, "crossqemu: {} - image created".format(toolname))

        cmd_output = ""
        if cmd:
            # Don't overwrite environment for the whole task,
            # just inject it into the subprocesses
            _altered_env = {
                "PSEUDO_UNLOAD": "1",
                "SHELL": "/bin/bash",
                "PATH": os.environ["PATH"] + ":/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin"
            }
            _args = ["{}/proot".format(d.getVar("STAGING_BINDIR_NATIVE")), "-r", _target_path, "--root-id"] + addargs
            _targs = ["/{}-static".format(qemu_target_binary(d))]
            if isinstance(cmd, str):
                cmd = cmd.split(" ")
            _targs += cmd
            try:
                cmd_output = subprocess.check_output(_args + _targs, stderr=subprocess.STDOUT, 
                                                    env={**os.environ, **_altered_env}, **subprocargs)
            except subprocess.CalledProcessError as e:
                cmd_output = e.stdout or ""

            sca_log_note(d, "crossqemu: {} - post run".format(toolname))
            __debug_chunk = min(1024, len(str(cmd_output))) - 1
            sca_log_note(d, str(cmd_output)[0:__debug_chunk])

        sca_log_note(d, "crossqemu: {} - post cmd".format(toolname))
        # explicitly flush the pseudo DB (once more)
        bb.build.exec_func("do_sca_crossemu_flush_pseudodb", d)
        return (cmd_output, _target_path)
