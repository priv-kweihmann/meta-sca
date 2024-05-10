SUMMARY = "An enterprise friendly way of detecting and preventing secrets in code"
HOMEPAGE = "https://github.com/Yelp/detect-secrets"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c3c8615794b2f159ecd80b4c32f2f8f"

DEPENDS += "\
            python3-native \
            python3-pyyaml-native \
            python3-requests-native \
           "

SRC_URI = "git://github.com/Yelp/detect-secrets.git;branch=master;protocol=https"
SRCREV = "01886c8a910c64595c47f186ca1ffc0b77fa5458"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "detectsecrets"
PIP_INSTALL_PACKAGE = "detect_secrets"

do_install:append() {
    # Remove the requests from the requires.txt, as this isn't working
    # for whatever reasons, no matter if requests is available or not
    find ${D} -name "requires.txt" -exec sed -i "/requests/d" {} +
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-datetime \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-netclient \
    nativesdk-python3-pyyaml \
    nativesdk-python3-requests \
    nativesdk-python3-stringold \
"
