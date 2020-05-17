SUMMARY = "NPM: string.prototype.trimstart"
DESCRIPTION = "ES2019 spec-compliant String.prototype.trimStart shim."
HOMEPAGE = "https://github.com/es-shims/String.prototype.trimStart#readme"

# To avoid dep loop remove npm-es-abstract-native
DEPENDS = "npm-define-properties-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e241a19d2d112b1db1a5c1c23216939"

SRC_URI = "https://registry.npmjs.org/string.prototype.trimstart/-/string.prototype.trimstart-1.0.1.tgz"
SRC_URI[md5sum] = "9d16e4228b3f550357d0359473f02322"
SRC_URI[sha256sum] = "446b546c404d668fa1c459f64a27ba549957299bfa8bfbf19f34b306cf5abef1"

NPM_PKGNAME = "string.prototype.trimstart"

inherit npmhelper
inherit native
