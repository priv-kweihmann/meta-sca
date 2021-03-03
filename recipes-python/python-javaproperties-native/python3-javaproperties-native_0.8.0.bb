SUMMARY = "Read & write Java .properties files"
HOMEPAGE = "https://github.com/jwodder/javaproperties"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://javaproperties-${PV}.dist-info/LICENSE;md5=c7e84b5c41617bda833ac2f57f269069"

# wheel-files are just zip-files, so we can threat them like that
SRC_URI = "https://files.pythonhosted.org/packages/a5/8c/f1feb005d5e19993fe93174a7cb818c86abcdae36408c147bf153e50a2ff/javaproperties-0.8.0-py3-none-any.whl;downloadfilename=javaproperties-${PV}-py2.py3-none-any.zip;subdir=${BP}"

SRC_URI[md5sum] = "8593da5d243720a8861376de70aa3e8a"
SRC_URI[sha256sum] = "b177c0ab70dc587b782154c564ec1e2e1b0e62b997a029e64ea2a0d51b394be1"

UPSTREAM_CHECK_URI ?= "https://pypi.python.org/pypi/javaproperties/"
UPSTREAM_CHECK_REGEX = ".*/javaproperties-(?P<pver>\d+\.\d+\.\d+)\.tar\.gz"

do_unpack[depends] += "unzip-native:do_populate_sysroot"

inherit python3native
inherit sca-description
inherit native

do_install() {
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/javaproperties
    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/javaproperties-${PV}.dist-info

    cp -r ${S}/javaproperties/* ${D}${libdir}/${PYTHON_DIR}/site-packages/javaproperties/
    install -m 644 ${S}/javaproperties-${PV}.dist-info/* ${D}${libdir}/${PYTHON_DIR}/site-packages/javaproperties-${PV}.dist-info/
}

FILES_${PN} += "${PYTHON_SITEPACKAGES_DIR}"
