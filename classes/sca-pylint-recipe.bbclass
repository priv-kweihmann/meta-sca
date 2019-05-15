inherit sca-pylint-core
inherit sca-global

inherit ${@oe.utils.ifelse(d.getVar('SCA_STD_PYTHON_INTERPRETER') == 'python3', 'python3-dir', 'python-dir')}

## Add ids to suppress on a recipe level
SCA_PYLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYLINT_EXTRA_FATAL ?= ""
## Folder to scan
SCA_PYLINT_ROOTPATH ?= "${B}"
## PYTHONHOME-path to use
SCA_PYLINT_HOMEPATH ?= "${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}"
## The Librarypath to use
SCA_PYLINT_LIBATH ?= "${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}/:${STAGING_LIBDIR}/python${PYTHON_BASEVERSION}/site-packages/"

SCA_DEPLOY_TASK = "do_sca_deploy_pylint_recipe"

python do_sca_deploy_pylint_recipe() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    src_raw = os.path.join(d.getVar("T"), "sca_raw_pylint.txt")
    src_conv = os.path.join(d.getVar("T"), "sca_checkstyle_pylint.xml")
    if os.path.exists(src_raw):
        shutil.copy(src_raw, raw_target)
    if os.path.exists(src_conv):
        shutil.copy(src_conv, cs_target)
    if os.path.exists(cs_target):
        do_sca_export_sources(d, cs_target)
}

addtask do_sca_pylint_core before do_install after do_compile
addtask do_sca_deploy_pylint_recipe before do_package after do_sca_pylint_core

DEPENDS += "sca-recipe-pylint-rules-native"