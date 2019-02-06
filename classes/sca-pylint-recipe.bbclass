inherit sca-pylint-core
inherit sca-global

## Add ids to suppress on a recipe level
SCA_PYLINT_EXTRA_SUPPRESS ?= ""
## Add ids to lead to a fatal on a recipe level
SCA_PYLINT_EXTRA_FATAL ?= ""
## Folder to scan
SCA_PYLINT_ROOTPATH ?= "${B}"
## PYTHONHOME-path to use
SCA_PYLINT_HOMEPATH ?= "${STAGING_LIBDIR}/python.3.5"
## The Librarypath to use
SCA_PYLINT_LIBATH ?= "${STAGING_LIBDIR}/python.3.5/:${STAGING_LIBDIR}/python.3.5/site-packages/"

python do_sca_deploy_pylint_recipe() {
    import os
    import shutil
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "raw"), exist_ok=True)
    os.makedirs(os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "checkstyle"), exist_ok=True)
    raw_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "raw", "{}-{}.txt".format(d.getVar("PN"), d.getVar("PV")))
    cs_target = os.path.join(d.getVar("SCA_EXPORT_DIR"), "pylint", "checkstyle", "{}-{}.xml".format(d.getVar("PN"), d.getVar("PV")))
    shutil.copy(os.path.join(d.getVar("T"), "sca_raw_pylint.txt"), raw_target)
    shutil.copy(os.path.join(d.getVar("T"), "sca_checkstyle_pylint.xml"), cs_target)
    do_sca_export_sources(d, cs_target)
}

addtask do_sca_pylint_core before do_install after do_compile
addtask do_sca_deploy_pylint_recipe before do_package after do_sca_pylint_core

DEPENDS += "sca-recipe-pylint-rules-native"