inherit sca-helper
inherit sca-global
inherit sca-jsonlint-core
inherit sca-conv-checkstyle-helper

SCA_DEPLOY_TASK = "do_sca_deploy_jsonlint_image"

python do_sca_deploy_jsonlint_image() {
    import os
    import shutil

    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "jsonlint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "jsonlint", "checkstyle"), exist_ok=True)

    import os

    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "jsonlint", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "jsonlint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_jsonlint.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_jsonlint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_jsonlint_core before do_image_complete after do_image
addtask do_sca_deploy_jsonlint_image before do_image_complete after do_sca_jsonlint_core

DEPENDS += "sca-image-jsonlint-rules-native"
