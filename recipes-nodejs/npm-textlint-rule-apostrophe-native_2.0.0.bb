SUMMARY = "NPM: textlint-rule-apostrophe"
DESCRIPTION = "Textlint rule to check correct apostrophe usage"
HOMEPAGE = "https://github.com/sapegin/textlint-rule-apostrophe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://License.md;md5=d1058b1fef8f032328c145f0982bcdef"

SRC_URI = "https://registry.npmjs.org/textlint-rule-apostrophe/-/textlint-rule-apostrophe-2.0.0.tgz"
SRC_URI[md5sum] = "578435b96e9049e83b27175f4a451b9f"
SRC_URI[sha256sum] = "759575f6456245383a9df1a8a68dd538dc1bf115153b7c07aa74abcf50c1ba9f"

NPM_PKGNAME = "textlint-rule-apostrophe"

inherit npmhelper
inherit native
