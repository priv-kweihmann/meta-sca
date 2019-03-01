inherit sca-helper
inherit sca-global
inherit sca-bandit-core
inherit sca-conv-checkstyle-helper

SCA_DEPLOY_TASK = "do_sca_deploy_bandit_image"

python do_sca_deploy_bandit_image() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "bandit", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "bandit", "checkstyle"), exist_ok=True)

    import os

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "bandit", "raw", "{}-{}.json".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "bandit", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_bandit.json")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_bandit.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_bandit_core before do_image_complete after do_image
addtask do_sca_deploy_bandit_image before do_image_complete after do_sca_bandit_core

DEPENDS += "sca-image-bandit-rules-native"
