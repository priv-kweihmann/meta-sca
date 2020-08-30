## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

python sca_bestof_init() {
    from bb.parse.parse_py import BBHandler

    BBHandler.inherit("sca-bestof-core", "sca_clang_init", 1, d)
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        for taskstr in ["do_sca_deploy_{}".format(item), "do_sca_deploy_{}_recipe".format(item)]:
            task = d.getVar(taskstr, False)
            if task is not None:
                d.appendVarFlag("do_sca_bestof_core", "depends", " {}:{}".format(d.getVar("PN"), taskstr))
}

do_sca_bestof_core[doc] = "Gather result for BestOf mode on recipe"
addtask do_sca_bestof_core after do_install before do_sca_deploy
