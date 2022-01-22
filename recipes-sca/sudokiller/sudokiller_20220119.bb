SUMMARY = "Find misconfigurations and vulnerabilities within sudo"
DESCRIPTION = "A tool to identify and exploit sudo rules' misconfigurations and vulnerabilities within sudo"
HOMEPAGE = "https://github.com/TH3xACE/SUDO_KILLER"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f45999e825d6792e32a1cbadd968b1b7"

SRC_URI = "git://github.com/TH3xACE/SUDO_KILLER.git;branch=master;protocol=https"
SRCREV = "7938326ad2e18225406ec5366f097de9a8010de5"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit sca-description

SCA_TOOL_DESCRIPTION = "sudokiller"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -d ${D}${bindir}/sudokiller
    cp -r ${S}/* ${D}${bindir}/sudokiller/
    # Rename main script to strip the version
    mv ${D}${bindir}/sudokiller/SUDO_KILLERv2*.sh ${D}${bindir}/sudokiller/sudokiller
    chmod +x ${D}${bindir}/sudokiller/sudokiller
    chown -R root:root ${D}${bindir}/sudokiller/
}

FILES:${PN} = "${bindir}"

RDEPENDS:${PN} += "bash"

# We don't really care about debug package for this one
# also because of the issue mentioned below
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

# Package contains exploit sample from (maybe) not matching arch
# plus all the dependencies from that arch
# Ignore that while packaging
INSANE_SKIP:${PN} += "file-rdeps arch already-stripped"

BBCLASSEXTEND = "native"
