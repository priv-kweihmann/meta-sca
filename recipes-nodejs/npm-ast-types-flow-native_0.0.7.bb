SUMMARY = "NPM: ast-types-flow"
DESCRIPTION = "Flow types for the Javascript AST"
HOMEPAGE = "https://github.com/kyldvs/ast-types-flow#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
# Does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/ISC;md5=f3b90e78ea0cffb20bf5cca7947a896d"

SRC_URI = "https://registry.npmjs.org/ast-types-flow/-/ast-types-flow-0.0.7.tgz"
SRC_URI[md5sum] = "f157845888225d76f2f5b34313ae2250"
SRC_URI[sha256sum] = "a7e147d5d2c921d8871d75f2942a99cb7af5774dfb9938708b5f3688acc076d3"

NPM_PKGNAME = "ast-types-flow"

inherit npmhelper
inherit native
