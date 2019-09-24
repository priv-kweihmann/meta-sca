## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-score-core

python sca_score_init() {
    from bb.parse.parse_py import BBHandler
    
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        for taskstr in ["do_sca_deploy_{}".format(item), "do_sca_deploy_{}_image".format(item)]:
            task = d.getVar(taskstr, False)
            if task is not None:
                d.appendVarFlag("do_sca_score_core", "depends", " {}:{}".format(d.getVar("PN"), taskstr))
}

addtask do_sca_score_core after do_install before do_package_write_rpm do_rm_work

do_sca_score_core[nostamp] = "${@sca_force_run(d)}"
