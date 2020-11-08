## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

SCA_SYSTEMDLINT_EXTRA_ARGS ?= "--norootfs"

inherit sca-systemdlint-core

# Needs to be overridden to make it work here
SCA_SYSTEMDLINT_SOURCES_DIR = "${D}"

addtask do_sca_systemdlint after do_install before do_sca_deploy

DEPENDS += "sca-recipe-systemdlint-rules-native"
