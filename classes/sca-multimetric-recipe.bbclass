## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-multimetric-core

SCA_DEPLOY_TASK = "do_sca_deploy_multimetric"

python do_sca_deploy_multimetric_recipe() {
    sca_conv_deploy(d, "multimetric", "json")
}

python sca_multimetric_init() {
    from bb.parse.parse_py import BBHandler
    
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        if item in ["bitbake"]:
            continue
        for taskstr in ["do_sca_deploy_{}".format(item), "do_sca_deploy_{}_image".format(item)]:
            task = d.getVar(taskstr, False)
            if task is not None:
                d.appendVarFlag("do_sca_multimetric_core", "depends", " {}:{}".format(d.getVar("PN"), taskstr))
}

addtask do_sca_multimetric_core after do_install before do_package do_rm_work
addtask do_sca_deploy_multimetric_recipe after do_sca_multimetric_core before do_package

do_sca_multimetric_core[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
do_sca_deploy_multimetric_recipe[depends] += "${@oe.utils.conditional('SCA_FORCE_RUN', '1', '${PN}:do_sca_do_force_meta_task', '', d)}"
