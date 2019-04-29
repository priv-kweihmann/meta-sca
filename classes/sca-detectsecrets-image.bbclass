inherit sca-helper
inherit sca-global
inherit sca-detectsecrets-core
inherit sca-conv-checkstyle-helper

SCA_DEPLOY_TASK = "do_sca_deploy_detectsecrets_image"

python do_sca_deploy_detectsecrets_image() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "detectsecrets", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "detectsecrets", "checkstyle"), exist_ok=True)

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "detectsecrets", "raw", "{}-{}.json".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "detectsecrets", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_detectsecrets.json")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_detectsecrets.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_detectsecrets_core before do_image_complete after do_image
addtask do_sca_deploy_detectsecrets_image before do_image_complete after do_sca_detectsecrets_core

DEPENDS += "sca-image-detectsecrets-rules-native"
