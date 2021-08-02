SUMMARY = "reuse is a tool for compliance with the REUSE recommendations"
HOMEPAGE = "https://github.com/fsfe/reuse-tool"

LICENSE = "GPL-3.0+ & Apache-2.0 & CC0-1.0 & CC-BY-SA-4.0"
LIC_FILES_CHKSUM = "\
                    file://LICENSES/Apache-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
                    file://LICENSES/CC-BY-SA-4.0.txt;md5=fba3b94d88bfb9b81369b869a1e9a20f \
                    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
                    file://LICENSES/GPL-3.0-or-later.txt;md5=1ebbd3e34237af26da5dc08a4e440464 \
                    "

DEPENDS += "\
            python3-binaryornot-native \
            python3-boolean.py-native \
            python3-debian-native \
            python3-jinja2-native \
            python3-license-expression-native \
            python3-requests-native \
            python3-setuptools-scm-native \
            "

SRC_URI:append = " file://reuse.sca.description"
SRC_URI[md5sum] = "e9df72dd944e6b02e9c378141e4b43ae"
SRC_URI[sha256sum] = "89c87bd49308c8059cc36f8116872d73dc6e5788a29af8869be6532202bff801"

PYPI_PACKAGE = "reuse"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/reuse.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
