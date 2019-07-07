inherit sca-helper
inherit sca-global
inherit sca-stylelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_stylelint_recipe"

python do_sca_deploy_stylelint_recipe() {
    sca_conv_deploy(d, "stylelint", "txt")
}

addtask do_sca_stylelint_core before do_install after do_compile
addtask do_sca_deploy_stylelint_recipe before do_package after do_sca_stylelint_core

do_sca_stylelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_stylelint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-stylelint-rules-native"
