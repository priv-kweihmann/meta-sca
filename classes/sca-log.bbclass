## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

def sca_log_note(d, msg):
    if d.getVar("SCA_VERBOSE_OUTPUT") != "0":
        bb.verbnote(msg)
