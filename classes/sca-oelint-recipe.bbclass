inherit sca-helper
inherit sca-global
inherit sca-oelint-core

SCA_DEPLOY_TASK = "do_sca_deploy_oelint_recipe"

python do_sca_deploy_oelint_recipe() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "oelint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "oelint", "checkstyle"), exist_ok=True)

    import os
    
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "oelint", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "oelint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_oelint.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_oelint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_oelint_core before do_install after do_compile
addtask do_sca_deploy_oelint_recipe before do_package after do_sca_oelint_core

DEPENDS += "sca-recipe-oelint-rules-native"
