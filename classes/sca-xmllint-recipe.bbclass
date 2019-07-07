inherit sca-helper
inherit sca-global
inherit sca-xmllint-core

SCA_DEPLOY_TASK = "do_sca_deploy_xmllint_recipe"

python do_sca_deploy_xmllint_recipe() {
    sca_conv_deploy(d, "xmllint", "txt")
}

addtask do_sca_xmllint_core before do_install after do_compile
addtask do_sca_deploy_xmllint_recipe before do_package after do_sca_xmllint_core

do_sca_xmllint_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_xmllint_recipe[nostamp] = "${@sca_force_run(d)}"

DEPENDS += "sca-recipe-xmllint-rules-native"
