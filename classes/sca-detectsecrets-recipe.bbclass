inherit sca-helper
inherit sca-global
inherit sca-detectsecrets-core
inherit sca-conv-to-export

SCA_DEPLOY_TASK = "do_sca_deploy_detectsecrets_recipe"

python do_sca_deploy_detectsecrets_recipe() {
    sca_conv_deploy(d, "detectsecrets", "json")
}

addtask do_sca_detectsecrets_core before do_install after do_compile
addtask do_sca_deploy_detectsecrets_recipe before do_package after do_sca_detectsecrets_core

DEPENDS += "sca-recipe-detectsecrets-rules-native"
