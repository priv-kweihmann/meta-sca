SUMMARY = "NPM: xml-escape"
DESCRIPTION = "Escape XML "
HOMEPAGE = "https://github.com/miketheprogrammer/xml-escape"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf446564f113cb820c94a7ceaea01fea"

SRC_URI = "https://registry.npmjs.org/xml-escape/-/xml-escape-1.1.0.tgz"
SRC_URI[md5sum] = "24b20ad37839e480e0fdacce748e2c6c"
SRC_URI[sha256sum] = "b0d466e10b916a9ba66b96b47872587ab0df1393bff8818f69911f3abc54ffa3"

NPM_PKGNAME = "xml-escape"

inherit npmhelper
inherit native
