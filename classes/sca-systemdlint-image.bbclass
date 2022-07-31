## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_SYSTEMDLINT_EXTRA_ARGS ?= ""

inherit sca-systemdlint-core

SCA_SYSTEMDLINT_SOURCES_DIR = "${SCA_SOURCES_DIR}"

do_sca_systemdlint[nosdkgen] = "1"
addtask do_sca_systemdlint before do_sca_deploy after do_image

DEPENDS += "sca-image-systemdlint-rules-native"
