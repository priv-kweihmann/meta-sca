# This class was heavily inspired by https://github.com/voxtok/meta-oad-ruby/blob/dizzy/classes/rubygems.bbclass

inherit base
inherit native

GEM_NAME ?= ""
GEM_SRC ?= "http://rubygems.org/gems"
GEM_VERSION ?= "${PV}"

SRC_URI += "${GEM_SRC}/${GEM_FILENAME}"

S = "${WORKDIR}/${GEM_NAME}-${GEM_VERSION}"

GEM_FILENAME = "${GEM_NAME}-${GEM_VERSION}.gem"
GEM_FILE ?= "${WORKDIR}/${GEM_FILENAME}"
GEM_BUILT_FILE = "${S}/${GEM_FILENAME}"

GEM_SPEC_FILENAME = "${GEM_FILENAME}spec"
GEM_SPEC_FILE ?= "${S}/${GEM_SPEC_FILENAME}"

GEM_DIR = "${libdir}/ruby/gems"
GEM_HOME = "${D}${GEM_DIR}"
GEM_PATH = "${STAGING_DIR}/${GEM_DIR}:${GEM_HOME}"

GEM_INSTALL_FLAGS ?= ""

RUBYLIB = "${STAGING_LIBDIR_NATIVE}/ruby/"
CFLAGS_append = " -DHAVE_GCC_CAS"

do_unpack_gem() {
    export RUBYLIB=${RUBYLIB}

    cd ${WORKDIR}
    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem unpack -V ${GEM_FILE}
}

DEPENDS += "ruby-native"

python () {
    d.appendVarFlag('do_unpack_gem', 'depends', ' ruby-native:do_populate_sysroot')
}

addtask unpack_gem after do_unpack before do_patch

do_generate_spec() {
    export RUBYLIB=${RUBYLIB}

    # GEM_FILE might not exist if SRC_URI was overloaded
    [ ! -e ${GEM_FILE} ] && return 0

    gem spec -V --ruby ${GEM_FILE} > ${GEM_SPEC_FILE}
}

addtask generate_spec after do_unpack_gem before do_patch

rubygemsnative_do_compile() {
    export GEM_PATH=${GEM_PATH}
    export GEM_HOME=${GEM_HOME}
    export RUBYLIB=${RUBYLIB}

    export LANG="en_US.UTF-8"
    export LANGUAGE="en_US.UTF-8"
    export LC_ALL="en_US.UTF-8"

    gem build -V ${GEM_SPEC_FILE}
}

rubygemsnative_do_install() {
    export GEM_PATH=${GEM_PATH}
    export GEM_HOME=${GEM_HOME}
    export RUBYLIB=${RUBYLIB}

    gem uninstall ${GEM_NAME} --version ${GEM_VERSION} -x -q -V || true

    gem install --local --bindir ${D}${bindir} ${GEM_BUILT_FILE} -E --no-user-install --ignore-dependencies --force --conservative -V -- ${GEM_INSTALL_FLAGS}
}

EXPORT_FUNCTIONS do_compile do_install

FILES_${PN} += "\
                ${GEM_DIR}/gems \
                ${GEM_DIR}/specifications \
                ${GEM_DIR}/extensions \
                "

UPSTREAM_CHECK_URI ?= "https://rubygems.org/gems/${GEM_NAME}/versions"
UPSTREAM_CHECK_REGEX ?= "/gems/${GEM_NAME}/versions/(?P<pver>(\d+[\.\-_]*)+)"
