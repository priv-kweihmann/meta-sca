DESCRIPTION = "A packagegroup for testing with meta-sca"

inherit packagegroup
inherit sca

PACKAGES = "\
    packagegroup-sca-test \
    "

RDEPENDS:packagegroup-sca-test = "\
    bad-javascript \
    bad-bitbake \
"
