## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

SCA_MULTIMETRIC_ERROR_maintainability_index_lt ?= "50.0"
SCA_MULTIMETRIC_ERROR_tiobe_lt ?= "50.0"
SCA_MULTIMETRIC_WARN_maintainability_index_lt ?= "80.0"
SCA_MULTIMETRIC_WARN_pylint_lt ?= "70.0"
SCA_MULTIMETRIC_WARN_tiobe_lt ?= "80.0"

inherit sca-multimetric-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_multimetric_recipe"

python do_sca_deploy_multimetric_recipe() {
    sca_conv_deploy(d, "multimetric")
}

python sca_multimetric_init() {
    for item in intersect_lists(d, d.getVar("SCA_ENABLED_MODULES"), d.getVar("SCA_AVAILABLE_MODULES")):
        if item in ["bitbake", "multimetric", "bestof", "imagesummary"]:
            continue
        for taskstr in ["do_sca_{}_report".format(item), "do_sca_{}_core_report".format(item)]:
            task = d.getVar(taskstr, False)
            if task is not None:
                d.appendVarFlag("do_sca_multimetric_core", "depends", " {}:{}".format(d.getVar("PN"), taskstr))
}

do_sca_multimetric_core[doc] = "Get code metrics"
do_sca_multimetric_core_report[doc] = "Report findings from do_sca_multimetric_core"
do_sca_deploy_multimetric_recipe[doc] = "Deploy results of do_sca_multimetric_core"
addtask do_sca_multimetric_core after do_compile
addtask do_sca_multimetric_core_report after do_sca_tracefiles
addtask do_sca_deploy_multimetric_recipe after do_sca_multimetric_core_report before do_package

DEPENDS += "sca-recipe-multimetric-rules-native"
