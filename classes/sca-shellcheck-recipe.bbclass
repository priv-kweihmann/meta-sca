## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-helper
inherit sca-global
inherit sca-shellcheck-core
inherit sca-tracefiles

SCA_DEPLOY_TASK = "do_sca_deploy_shellcheck_recipe"

python do_sca_deploy_shellcheck_recipe() {
    sca_conv_deploy(d, "shellcheck")
}

do_sca_shellcheck_core[doc] = "Lint shell script with shellcheck"
do_sca_shellcheck_core_report[doc] = "Report findings from do_sca_shellcheck_core"
do_sca_deploy_shellcheck_recipe[doc] = "Deploy results of do_sca_shellcheck_core"
addtask do_sca_shellcheck_core after do_compile before do_sca_tracefiles
addtask do_sca_shellcheck_core_report after do_sca_tracefiles
addtask do_sca_deploy_shellcheck_recipe after do_sca_shellcheck_core_report before do_package

DEPENDS += "sca-recipe-shellcheck-rules-native"
