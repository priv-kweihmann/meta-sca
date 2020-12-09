## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

inherit sca-helper
inherit sca-conv-to-export
inherit sca-deploy-common

addtask do_sca_deploy before do_image_complete
