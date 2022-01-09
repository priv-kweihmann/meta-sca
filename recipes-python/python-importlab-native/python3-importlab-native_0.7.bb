
SUMMARY = "A library to calculate python dependency graphs."
HOMEPAGE = "https://github.com/google/importlab"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "python3-networkx-native python3-six-native"

PYPI_PACKAGE = "importlab"

SRC_URI[md5sum] = "92c368d48afe204a57a91deafaa40e58"
SRC_URI[sha256sum] = "744bd75d4410744962d203bd1eb71a950b19e8fb8eb5f0b805461dc0a2da329b"

inherit pypi
inherit setuptools3
inherit native
