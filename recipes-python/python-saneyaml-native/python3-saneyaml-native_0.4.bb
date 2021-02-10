SUMMARY = "Dump readable YAML and load safely any YAML"
HOMEPAGE = "http://aboutcode.org/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

DEPENDS += "\
            python3-pyyaml-native \
            "

PYPI_PACKAGE = "saneyaml"

SRC_URI[md5sum] = "9359719331a836e766035030a624146e"
SRC_URI[sha256sum] = "9a1863a9d27586fd86c30b9736478a7d441bf1d118cdc71a2fec0d94cfc3cf5c"

inherit pypi
inherit setuptools3
inherit native
