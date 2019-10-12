## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-tlv-core
inherit sca-global

SCA_DEPLOY_TASK = "do_sca_deploy_tlv_recipe"

SCA_TLV_FILES ?= "${SCA_SOURCES_DIR}/* ${SCA_SOURCES_DIR}/**/*"

python do_sca_deploy_tlv_recipe() {
   sca_conv_deploy(d, "tlv", "txt")
}

do_compile[postfuncs] += "do_sca_tlv_core"
do_package[prefuncs] += "do_sca_deploy_tlv_recipe"

do_sca_tlv_core[nostamp] = "${@sca_force_run(d)}"
do_sca_deploy_tlv_recipe[nostamp] = "${@sca_force_run(d)}"