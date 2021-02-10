SUMMARY = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "python3-flake8-native"

SRC_URI_append = " file://flake8.sca.description"

inherit sca-description
inherit python3-dir
inherit native

PACKAGECONFIG ??= "\
                   2020 \
                   comprehensions \
                   dlint \
                   eradicate \
                   executable \
                   expression-complexity \
                   fixme \
                   functions \
                   import-order \
                   mutable \
                   quotes \
                   requirements \
                   strict \
                   string-format \
                   variables-names \
                   wemake-python \
                  "
PACKAGECONFIG[2020] = ",,python3-flake8-2020-native"
PACKAGECONFIG[comprehensions] = ",,python3-flake8-comprehensions-native"
PACKAGECONFIG[dlint] = ",,python3-flake8-dlint-native"
PACKAGECONFIG[eradicate] = ",,python3-flake8-eradicate-native"
PACKAGECONFIG[executable] = ",,python3-flake8-executable-native"
PACKAGECONFIG[expression-complexity] = ",,python3-flake8-expression-complexity-native"
PACKAGECONFIG[fixme] = ",,python3-flake8-fixme-native"
PACKAGECONFIG[functions] = ",,python3-flake8-functions-native"
PACKAGECONFIG[import-order] = ",,python3-flake8-import-order-native"
PACKAGECONFIG[mutable] = ",,python3-flake8-mutable-native"
PACKAGECONFIG[quotes] = ",,python3-flake8-quotes-native"
PACKAGECONFIG[requirements] = ",,python3-flake8-requirements-native"
PACKAGECONFIG[strict] = ",,python3-flake8-strict-native"
PACKAGECONFIG[string-format] = ",,python3-flake8-string-format-native"
PACKAGECONFIG[variables-names] = ",,python3-flake8-variables-names-native"
PACKAGECONFIG[wemake-python] = ",,python3-wemake-python-styleguide-native"

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flake8.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
