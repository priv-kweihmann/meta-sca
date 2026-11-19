SUMMARY = "reuse is a tool for compliance with the REUSE recommendations"
HOMEPAGE = "https://github.com/fsfe/reuse-tool"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 AND CC-BY-SA-4.0 AND CC0-1.0 AND GPL-3.0-or-later"
LIC_FILES_CHKSUM = "\
    file://LICENSES/Apache-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSES/CC-BY-SA-4.0.txt;md5=fba3b94d88bfb9b81369b869a1e9a20f \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/GPL-3.0-or-later.txt;md5=1ebbd3e34237af26da5dc08a4e440464 \
"

DEPENDS += "\
    python3-attrs-native \
    python3-click-native \
    python3-chardet-native \
    python3-booleanpy-native \
    python3-debian-native \
    python3-jinja2-native \
    python3-license-expression-native \
    python3-requests-native \
    python3-tomlkit-native \
"

SRC_URI[md5sum] = "8d2e895eb2ea0e3a1aebc360b2f45ec2"
SRC_URI[sha256sum] = "5a6ca437057c07ca22a67256520e2783ab03b5524d3a4535603c3d49e3d4b001"

PYPI_PACKAGE = "reuse"

inherit pypi
inherit sca-description
inherit python_poetry_core
inherit_defer native

SCA_TOOL_DESCRIPTION = "reuse"
