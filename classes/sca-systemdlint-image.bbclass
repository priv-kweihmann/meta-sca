## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_SYSTEMDLINT_EXTRA_ARGS ?= ""

inherit sca-systemdlint-core

addtask do_sca_systemdlint before do_sca_deploy after do_image

DEPENDS += "sca-image-systemdlint-rules-native"
