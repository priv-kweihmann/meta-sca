SUMMARY = "An enterprise friendly way of detecting and preventing secrets in code"
HOMEPAGE = "https://github.com/Yelp/detect-secrets"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c3c8615794b2f159ecd80b4c32f2f8f"

DEPENDS += "\
            python3-native \
            python3-pyyaml-native \
            python3-requests-native \
           "

SRC_URI = "git://github.com/Yelp/detect-secrets.git;protocol=https"
SRC_URI += "file://detectsecrets.sca.description"
SRCREV = "1c325e8433d732b3ac7783686651c5b98abbfe63"
S = "${WORKDIR}/git"

inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/detectsecrets.sca.description ${D}${datadir}

    # Remove the requests from the requires.txt, as this isn't working
    # for whatever reasons, no matter if requests is available or not
    find ${D} -name "requires.txt" -exec sed -i "/requests/d" {} +
}

FILES_${PN} += "${datadir}"
