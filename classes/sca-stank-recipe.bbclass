inherit sca-helper
inherit sca-global
inherit sca-stank-core

SCA_DEPLOY_TASK = "do_sca_deploy_stank_recipe"

python do_sca_deploy_stank_recipe() {
    sca_conv_deploy(d, "stank", "txt")
}

addtask do_sca_stank_core before do_install after do_compile
addtask do_sca_deploy_stank_recipe before do_package after do_sca_stank_core

do_sca_stank_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_stank_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-stank-rules-native"
