SRC_URI += "https://proxy.golang.org/github.com/json-iterator/go/@v/v1.1.10.zip;srcoutput=github.com/json-iterator/go;srcinput=github.com/json-iterator/go@v1.1.10;downloadfilename=github-com-json-iterator-go-1.1.10.zip;name=github-com-json-iterator-go"
SRC_URI[github-com-json-iterator-go.sha256sum] = "2311e83151f13b90ca153a613af5feaf4ffa8618abda33cd58719cebd1dc5bb7"
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
