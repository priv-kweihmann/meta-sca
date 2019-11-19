## This is a alias-recipe
GO_IMPORT = "mvdan.cc/sh"
include github.com-mvdan-sh-native_${PV}.bb

DEPENDS_remove = "mvdan.cc-sh-native"
DEPENDS += "golang.org-lib-native"

do_install_append() {
    ## remove duplicated files
    rm ${D}${bindir}/gosh
    rm ${D}${bindir}/shfmt
}