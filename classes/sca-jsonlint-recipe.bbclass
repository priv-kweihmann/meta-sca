inherit sca-helper
inherit sca-global
inherit sca-jsonlint-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_jsonlint_recipe"

python do_sca_deploy_jsonlint_recipe() {
    sca_conv_deploy(d, "jsonlint", "txt")
}

addtask do_sca_jsonlint_core before do_install after do_compile
addtask do_sca_deploy_jsonlint_recipe before do_package after do_sca_jsonlint_core

do_sca_jsonlint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_jsonlint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-jsonlint-rules-native"
