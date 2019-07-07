inherit sca-helper
inherit sca-global
inherit sca-bandit-core

SCA_DEPLOY_TASK = "do_sca_deploy_bandit_recipe"

python do_sca_deploy_bandit_recipe() {
    sca_conv_deploy(d, "bandit", "json")
}

addtask do_sca_bandit_core before do_install after do_compile
addtask do_sca_deploy_bandit_recipe before do_package after do_sca_bandit_core

do_sca_bandit_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_bandit_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-bandit-rules-native"
