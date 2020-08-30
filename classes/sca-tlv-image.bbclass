## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2019, Konrad Weihmann

inherit sca-tlv-core
inherit sca-global

SCA_TLV_FILES ?= "${sysconfdir}/* ${sysconfdir}/**/*"

do_sca_tlv_core[doc] = "Find duplicate code in config files of image"
do_sca_tlv_core_report[doc] = "Report findings from do_sca_tlv_core"
addtask do_sca_tlv_core before do_image_complete after do_image
addtask do_sca_tlv_core_report after do_sca_tlv_core before do_sca_deploy
