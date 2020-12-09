## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2020, Konrad Weihmann

inherit sca-helper

def _sca_manually_cleanup(d):
    import glob
    import os
    for item in glob.glob(os.path.join(d.getVar("SCA_EXPORT_DIR"), "*", "*", "{}-*.*".format(d.getVar("PN")))):
        try:
            os.remove(item)
        except:
            pass

python do_sca_deploy() {
    _sca_manually_cleanup(d)
    for x in clean_split(d, "SCA_ACTIVE_MODULES"):
        bb.debug(2, "Creating deploy for {}".format(x))
        sca_conv_deploy(d, x)
}

do_sca_deploy[doc] = "Deploy results of all active SCA modules"
do_sca_deploy[vardeps] += "SCA_ACTIVE_MODULES"
do_sca_deploy[dirs] = "${SCA_FINDINGS_DIR} ${SCA_EXPORT_DIR}"
do_sca_deploy[cleandirs] = "${SCA_FINDINGS_DIR}"
do_sca_deploy[sstate-inputdirs] = "${SCA_FINDINGS_DIR}"
do_sca_deploy[sstate-outputdirs] = "${SCA_EXPORT_DIR}/"
do_sca_deploy[stamp-extra-info] = "${MACHINE_ARCH}"

SSTATETASKS += "do_sca_deploy"

python do_sca_deploy_setscene() {
    sstate_setscene(d)
}
addtask do_sca_deploy_setscene
