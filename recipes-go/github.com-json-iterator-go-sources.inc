SRC_URI += "https://proxy.golang.org/github.com/json-iterator/go/@v/v1.1.12.zip;srcoutput=github.com/json-iterator/go;srcinput=github.com/json-iterator/go@v1.1.12;downloadfilename=github-com-json-iterator-go-1.1.12.zip;name=github-com-json-iterator-go"
SRC_URI[github-com-json-iterator-go.sha256sum] = "d001ea57081afd0e378467c8f4a9b6a51259996bb8bb763f78107eaf12f99501"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/api_tests"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/benchmarks"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/extension_tests"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/misc_tests"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/skip_tests"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/value_tests"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/type_tests"
GOSRC_REMOVEDIRS += "github.com/json-iterator/go/any_tests"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/json-iterator/go/LICENSE;md5=0b69744b481d72d30dbf69f84a451cfd \
"

GOSRC_INCLUDEGUARD += "github.com-json-iterator-go-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-modern-go-concurrent-sources.inc', '', 'github.com-modern-go-concurrent-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-modern-go-reflect2-sources.inc', '', 'github.com-modern-go-reflect2-sources.inc', d)}
