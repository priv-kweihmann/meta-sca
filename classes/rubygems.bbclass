# Based on https://github.com/voxtok/meta-oad-ruby/blob/dizzy/classes/rubygems.bbclass
## SPDX-License-Identifier: MIT, BSD-2-Clause
## Copyright (c) 2015, Michaël Burtin
## Copyright (c) 2020, Konrad Weihmann

GEM_SRC ?= "http://rubygems.org/gems"

GEM_NAME ?= ""
GEM_VERSION ?= "${PV}"

SRC_URI = "${GEM_SRC}/${GEM_FILENAME}"
GEMPREFIX = "gem-"

S = "${WORKDIR}/${GEM_NAME}-${GEM_VERSION}"

GEM_FILENAME = "${GEM_NAME}-${GEM_VERSION}.gem"
GEM_FILE ?= "${WORKDIR}/${GEM_FILENAME}"
GEM_BUILT_FILE = "${S}/${GEM_FILENAME}"

GEM_SPEC_FILENAME = "${GEM_FILENAME}spec"
GEM_SPEC_FILE ?= "${S}/${GEM_SPEC_FILENAME}"
GEM_SPEC_CACHE ?= "${T}/.gems"

GEM_DIR = "${libdir}/ruby/gems"
RUBY_SITEDIR = "${libdir}/ruby/site_ruby/"
GEM_HOME = "${D}${GEM_DIR}"
GEM_PATH_class-target = "${RECIPE_SYSROOT}${GEM_DIR}:${RECIPE_SYSROOT_NATIVE}${GEM_DIR}:${GEM_HOME}"
GEM_PATH_class-native = "${RECIPE_SYSROOT_NATIVE}${GEM_DIR}:${GEM_HOME}"

# Disable the very strict versioning with ~>
GEM_DISABLE_STRICT_VER ?= "1"

GEM_INSTALL_FLAGS ?= ""

RUBYLIB_class-target = "${STAGING_LIBDIR}/ruby/${@get_cross_platform_folder(d)}"
CFLAGS_append = " -DHAVE_GCC_CAS"

def get_gem_name_from_bpn(d):
    bpn = (d.getVar('BPN', True) or "")
    gemPrefix = (d.getVar('GEMPREFIX', True) or "")
    if bpn.startswith(gemPrefix):
        gemName = bpn[len(gemPrefix):]
    else:
        gemName = bpn
    return gemName

def get_cross_platform_folder(d):
    target_arch = d.getVar("TARGET_ARCH",True)
    target_os = d.getVar("TARGET_OS",True)
    if target_os.endswith("linux"):
        target_os = target_os.replace('linux', 'linux-gnu')
    return target_arch + "-" + target_os + "-cross"


do_unpack_gem() {
    export RUBYLIB=${RUBYLIB}

    cd ${WORKDIR}
    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem unpack -V ${GEM_FILE}
}

DEPENDS_append_class-native = " ${@d.getVar('RDEPENDS_' + '${PN}', True) or ''}"
DEPENDS_append_class-target = " ruby-cross-${TARGET_ARCH}"

python () {
    # unpack_gem need ruby to be installed in sysroot to succeed
    if bb.data.inherits_class('native', d):
        d.appendVarFlag('do_unpack_gem', 'depends', ' ruby-native:do_populate_sysroot')
    else:
        d.appendVarFlag('do_unpack_gem', 'depends', ' ruby-cross-%s:do_populate_sysroot' % d.getVar("TARGET_ARCH", True))
}

addtask unpack_gem after do_unpack before do_patch

do_generate_spec() {
    export RUBYLIB=${RUBYLIB}
    export GEM_SPEC=${GEM_SPEC_CACHE}

    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem spec -V --ruby ${GEM_FILE} > ${GEM_SPEC_FILE}

    # lift the version bindings to be less strict
    if [ "${GEM_DISABLE_STRICT_VER}" -eq "1" ]; then
        sed -i 's#~>#>=#g' ${GEM_SPEC_FILE}
        sed -i 's#<=[[:space:]]*[0-9]\+\.[0-9]\+\.[0-9]\+#!=0#g' ${GEM_SPEC_FILE}
        sed -i 's#<[[:space:]]*[0-9]\+\.[0-9]\+\.[0-9]\+#!=0#g' ${GEM_SPEC_FILE}
        sed -i 's#<[[:space:]]*[0-9]\+\.[0-9]\+#!=0#g' ${GEM_SPEC_FILE}
    fi
}

addtask generate_spec after do_unpack_gem before do_patch

rubygems_do_compile() {
    export GEM_PATH=${GEM_PATH}
    export GEM_HOME=${GEM_HOME}
    export GEM_SPEC=${GEM_SPEC_CACHE}
    export RUBYLIB=${RUBYLIB}

    export LANG="en_US.UTF-8"
    export LANGUAGE="en_US.UTF-8"
    export LC_ALL="en_US.UTF-8"

    # Older versions of gem build don't understand -o flag, so try it once more without 
    # it, if the command is failing
    gem build -V ${GEM_SPEC_FILE} -o ${GEM_BUILT_FILE} || gem build -V ${GEM_SPEC_FILE}
}

rubygems_do_install() {
    export GEM_PATH=${GEM_PATH}
    export GEM_SPEC=${GEM_SPEC_CACHE}
    export RUBYLIB=${RUBYLIB}

    gem uninstall ${GEM_NAME} --version ${GEM_VERSION} -x -q -V || true

    gem install --local --bindir ${D}${bindir} ${GEM_BUILT_FILE} --install-dir=${GEM_HOME} -E --no-user-install --ignore-dependencies --force --conservative -V -- ${GEM_INSTALL_FLAGS}

    install -d ${D}${RUBY_SITEDIR}/${GEM_NAME}
    find ${GEM_HOME} -name "*.so" -type f -exec sh -c "cp {} ${D}${RUBY_SITEDIR}/${GEM_NAME}/\$(basename {})" \;
}

EXPORT_FUNCTIONS do_compile do_install

PACKAGES =+ "${PN}-examples ${PN}-tests"

FILES_${PN}-dbg += "/usr/src/debug/* \
                    ${libdir}/ruby/*/.debug \
                    ${libdir}/ruby/*/*/.debug \
                    ${libdir}/ruby/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/*/*/.debug \
                    ${libdir}/ruby/*/*/*/*/*/*/*/*/.debug \
"
FILES_${PN}-staticdev += "${libdir}/ruby/gems/gems/*/ext/*/*/.libs/*.a"
FILES_${PN}-dev += "${GEM_DIR}/gems/*/debian.template \
                    ${GEM_DIR}/cache \
                    ${GEM_DIR}/build_info \
                    ${GEM_DIR}/gems/*/lib/generators \
"
FILES_${PN}-tests = "${GEM_DIR}/gems/*/tests \
                     ${GEM_DIR}/gems/*/test \
"
FILES_${PN}-examples = "${GEM_DIR}/gems/*/example"
FILES_${PN}-doc += "${GEM_DIR}/gems/*/doc \
                    ${GEM_DIR}/doc \
"
FILES_${PN} += "${GEM_DIR}/gems \
                ${GEM_DIR}/specifications \
                ${GEM_DIR}/extensions \
                ${bindir} \
                ${RUBY_SITEDIR} \
"

RDEPENDS_${PN}_append_class-target += "ruby"

UPSTREAM_CHECK_URI ?= "https://rubygems.org/gems/${GEM_NAME}/versions"
UPSTREAM_CHECK_REGEX ?= "/gems/${GEM_NAME}/versions/(?P<pver>(\d+\.*)*\d+)$"

BBCLASSEXTEND += "native"

# Skip automatically, as this is an intended side effect
INSANE_SKIP_${PN} += "dev-so"
