inherit sca-helper
inherit sca-global
inherit sca-ansiblelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_ansiblelint_recipe"

python do_sca_deploy_ansiblelint_recipe() {
    sca_conv_deploy(d, "ansiblelint", "txt")
}

addtask do_sca_ansiblelint_core before do_install after do_compile
addtask do_sca_deploy_ansiblelint_recipe before do_package after do_sca_ansiblelint_core

do_sca_ansiblelint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_ansiblelint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-ansiblelint-rules-native"
