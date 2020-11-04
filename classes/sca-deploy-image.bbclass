inherit sca-helper

python do_sca_deploy() {
    for x in clean_split(d, "SCA_ACTIVE_MODULES"):
        bb.debug(2, "Creating deploy for {}".format(x))
        sca_conv_deploy(d, x)
}

do_sca_deploy[doc] = "Deploy results of all active SCA modules"
do_sca_deploy[vardeps] += "SCA_ACTIVE_MODULES"
addtask do_sca_deploy before do_image_complete
