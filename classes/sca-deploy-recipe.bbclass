inherit sca-helper

python do_sca_deploy() {
    for x in clean_split(d, "SCA_ACTIVE_MODULES"):
        sca_conv_deploy(d, x)
}

do_sca_deploy[doc] = "Deploy results of all active SCA modules"
addtask do_sca_deploy before do_package_write_rpm do_package_write_deb do_package_write_tar do_package_write_ipk
