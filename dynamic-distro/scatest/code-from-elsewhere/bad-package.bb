SUMMARY = "A really bad package"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "CLOSED& GPL-2.0-or-later |MIT"

SRC_URI += "\
            file://test1/LICENSE;subdir=source \
            file://test1/LICENSE.gpl2;subdir=source \
            file://test2/LICENSE;subdir=source \
            file://test1/test-1.sh;subdir=source \
            file://test2/test-2.sh;subdir=source \
            file://simple-hello-world.c;subdir=source \
            file://python_builtins.py;subdir=source \
            https://raw.githubusercontent.com/priv-kweihmann/shellexeclist/4f2236770b7227e3654448a5377dd7f5547a29e1/testfiles/K01speech-dispatcher;subdir=source;name=shell \
            https://files.pythonhosted.org/packages/39/11/8076571afd97303dfeb6e466f27187ca4970918d4b36d5326725514d3ed3/Jinja2-3.0.1.tar.gz;subdir=source/jinja2;name=pypkg \
           "
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"
SRC_URI[shell.sha256sum] = "3f8b5e53d3383a9c75fe76a384c0f1c13291ae367b55bd7df3b5bb21f677e40e"
SRC_URI[pypkg.sha256sum] = "703f484b47a6af502e743c9122595cc812b0271f661722403114f71a79d0f5a4"

S = "${UNPACKDIR}"

CUSTOM_VAR = "/dev/disk"

do_configure() {
    set +e
    ls ${CUSTOM_VAR} || true
}

do_compile() {
    :
}

do_install() {
    install -d ${D}${bindir}
    install -m 0477 ${S}/source/test1/test-1.sh ${D}${bindir}

    install -d ${D}/opt/bin
    install -m 0777 ${S}/source/test2/test-2.sh ${D}/opt/bin/
    install -m 0755 ${S}/source/python_builtins.py ${D}/opt/bin/

    install -d ${D}${datadir}/myhiddensources
    install -m 0644 ${S}/source/simple-hello-world.c ${D}${datadir}/myhiddensources
    install -m 0644 ${S}/source/K01speech-dispatcher ${D}${datadir}/myhiddensources

    install -d ${D}${PYTHON_SITEPACKAGES_DIR}/jinja2
    cp -R ${S}/source/jinja2/* ${D}${PYTHON_SITEPACKAGES_DIR}/jinja2
}

PACKAGES =. "${PN}-strangepath ${PN}-hidden ${PN}-script "

FILES:${PN} = "${bindir}/curl.ermine"
FILES:${PN}-hidden = "${datadir} ${PYTHON_SITEPACKAGES_DIR}"
RDEPENDS:${PN}-hidden += "python3-core"
FILES:${PN}-script = "${bindir}/test-1.sh"
FILES:${PN}-strangepath = "/opt/bin/"
RDEPENDS:${PN}-strangepath += "\
    python3-asyncio \
    python3-audio \
    python3-codecs \
    python3-compile \
    python3-compression \
    python3-core \
    python3-crypt \
    python3-ctypes \
    python3-curses \
    python3-datetime \
    python3-db \
    python3-debugger \
    python3-difflib \
    python3-doctest \
    python3-email \
    python3-fcntl \
    python3-html \
    python3-image \
    python3-io \
    python3-json \
    python3-logging \
    python3-mailbox \
    python3-math \
    python3-mime \
    python3-misc \
    python3-mmap \
    python3-multiprocessing \
    python3-netclient \
    python3-netserver \
    python3-numbers \
    python3-pickle \
    python3-plistlib \
    python3-pprint \
    python3-profile \
    python3-pydoc \
    python3-resource \
    python3-shell \
    python3-sqlite3 \
    python3-stringold \
    python3-syslog \
    python3-terminal \
    python3-tests \
    python3-threading \
    python3-tkinter \
    python3-unittest \
    python3-unixadmin \
    python3-venv \
    python3-xml \
    python3-xmlrpc \
"

INSANE_SKIP:${PN} += "already-stripped arch"

inherit sca
inherit python3-dir

SCA_ENABLED_MODULES = "bitbake pkgqaenc licensecheck reuse scancode"
