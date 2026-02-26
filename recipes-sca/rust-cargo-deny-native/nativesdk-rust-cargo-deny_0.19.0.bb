SUMMARY = "Cargo plugin for linting your dependencies"
LICENSE = "Apache-2.0 & MIT"
LIC_FILES_CHKSUM = "file://LICENSE-APACHE;md5=8f7bb094c7232b058c7e9f2e431f389c \
                    file://LICENSE-MIT;md5=a9e22c5c3122ce58054e0c879821779e"

CRATES_LIST = "\
    crate://crates.io/adler2/2.0.1 \
    crate://crates.io/aho-corasick/1.1.4 \
    crate://crates.io/allocator-api2/0.2.21 \
    crate://crates.io/anstream/0.6.21 \
    crate://crates.io/anstyle-parse/0.2.7 \
    crate://crates.io/anstyle-query/1.1.5 \
    crate://crates.io/anstyle-wincon/3.0.11 \
    crate://crates.io/anstyle/1.0.13 \
    crate://crates.io/anyhow/1.0.100 \
    crate://crates.io/arc-swap/1.8.0 \
    crate://crates.io/async-compression/0.4.36 \
    crate://crates.io/atomic-waker/1.1.2 \
    crate://crates.io/autocfg/1.5.0 \
    crate://crates.io/base64/0.22.1 \
    crate://crates.io/bitflags/2.10.0 \
    crate://crates.io/bitvec/1.0.1 \
    crate://crates.io/block-buffer/0.10.4 \
    crate://crates.io/borsh/1.6.0 \
    crate://crates.io/bstr/1.12.1 \
    crate://crates.io/bumpalo/3.19.1 \
    crate://crates.io/byteorder/1.5.0 \
    crate://crates.io/bytes/1.11.0 \
    crate://crates.io/camino/1.2.2 \
    crate://crates.io/cargo-lock/11.0.0 \
    crate://crates.io/cc/1.2.51 \
    crate://crates.io/cesu8/1.1.0 \
    crate://crates.io/cfg-expr/0.20.5 \
    crate://crates.io/cfg-if/1.0.4 \
    crate://crates.io/cfg_aliases/0.2.1 \
    crate://crates.io/clap/4.5.54 \
    crate://crates.io/clap_builder/4.5.54 \
    crate://crates.io/clap_derive/4.5.49 \
    crate://crates.io/clap_lex/0.7.6 \
    crate://crates.io/clru/0.6.2 \
    crate://crates.io/codespan-reporting/0.13.1 \
    crate://crates.io/codespan/0.13.1 \
    crate://crates.io/colorchoice/1.0.4 \
    crate://crates.io/combine/4.6.7 \
    crate://crates.io/compression-codecs/0.4.35 \
    crate://crates.io/compression-core/0.4.31 \
    crate://crates.io/console/0.15.11 \
    crate://crates.io/core-foundation-sys/0.8.7 \
    crate://crates.io/core-foundation/0.10.1 \
    crate://crates.io/cpufeatures/0.2.17 \
    crate://crates.io/crc32fast/1.5.0 \
    crate://crates.io/crossbeam-channel/0.5.15 \
    crate://crates.io/crossbeam-deque/0.8.6 \
    crate://crates.io/crossbeam-epoch/0.9.18 \
    crate://crates.io/crossbeam-queue/0.3.12 \
    crate://crates.io/crossbeam-utils/0.8.21 \
    crate://crates.io/crossbeam/0.8.4 \
    crate://crates.io/crypto-common/0.1.7 \
    crate://crates.io/cvss/2.2.0 \
    crate://crates.io/deranged/0.5.5 \
    crate://crates.io/digest/0.10.7 \
    crate://crates.io/displaydoc/0.2.5 \
    crate://crates.io/dunce/1.0.5 \
    crate://crates.io/either/1.15.0 \
    crate://crates.io/encode_unicode/1.0.0 \
    crate://crates.io/encoding_rs/0.8.35 \
    crate://crates.io/equivalent/1.0.2 \
    crate://crates.io/errno/0.3.14 \
    crate://crates.io/faster-hex/0.10.0 \
    crate://crates.io/fastrand/2.3.0 \
    crate://crates.io/fern/0.7.1 \
    crate://crates.io/filetime/0.2.26 \
    crate://crates.io/find-msvc-tools/0.1.6 \
    crate://crates.io/fixedbitset/0.5.7 \
    crate://crates.io/flate2/1.1.5 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foldhash/0.1.5 \
    crate://crates.io/foldhash/0.2.0 \
    crate://crates.io/form_urlencoded/1.2.2 \
    crate://crates.io/fs-err/3.2.2 \
    crate://crates.io/fs_extra/1.3.0 \
    crate://crates.io/funty/2.0.0 \
    crate://crates.io/futures-channel/0.3.31 \
    crate://crates.io/futures-core/0.3.31 \
    crate://crates.io/futures-io/0.3.31 \
    crate://crates.io/futures-sink/0.3.31 \
    crate://crates.io/futures-task/0.3.31 \
    crate://crates.io/futures-util/0.3.31 \
    crate://crates.io/generic-array/0.14.7 \
    crate://crates.io/getrandom/0.2.16 \
    crate://crates.io/getrandom/0.3.4 \
    crate://crates.io/gix-actor/0.37.1 \
    crate://crates.io/gix-attributes/0.29.0 \
    crate://crates.io/gix-bitmap/0.2.15 \
    crate://crates.io/gix-chunk/0.4.12 \
    crate://crates.io/gix-command/0.6.5 \
    crate://crates.io/gix-commitgraph/0.31.0 \
    crate://crates.io/gix-config-value/0.16.0 \
    crate://crates.io/gix-config/0.50.0 \
    crate://crates.io/gix-credentials/0.34.1 \
    crate://crates.io/gix-date/0.12.1 \
    crate://crates.io/gix-diff/0.57.1 \
    crate://crates.io/gix-discover/0.45.0 \
    crate://crates.io/gix-features/0.45.2 \
    crate://crates.io/gix-filter/0.24.1 \
    crate://crates.io/gix-fs/0.18.2 \
    crate://crates.io/gix-glob/0.23.0 \
    crate://crates.io/gix-hash/0.21.2 \
    crate://crates.io/gix-hashtable/0.11.0 \
    crate://crates.io/gix-ignore/0.18.0 \
    crate://crates.io/gix-index/0.45.1 \
    crate://crates.io/gix-lock/20.0.1 \
    crate://crates.io/gix-negotiate/0.25.0 \
    crate://crates.io/gix-object/0.54.1 \
    crate://crates.io/gix-odb/0.74.0 \
    crate://crates.io/gix-pack/0.64.1 \
    crate://crates.io/gix-packetline/0.20.0 \
    crate://crates.io/gix-path/0.10.22 \
    crate://crates.io/gix-pathspec/0.14.0 \
    crate://crates.io/gix-prompt/0.12.0 \
    crate://crates.io/gix-protocol/0.55.0 \
    crate://crates.io/gix-quote/0.6.1 \
    crate://crates.io/gix-ref/0.57.0 \
    crate://crates.io/gix-refspec/0.35.0 \
    crate://crates.io/gix-revision/0.39.0 \
    crate://crates.io/gix-revwalk/0.25.0 \
    crate://crates.io/gix-sec/0.12.2 \
    crate://crates.io/gix-shallow/0.7.0 \
    crate://crates.io/gix-submodule/0.24.0 \
    crate://crates.io/gix-tempfile/20.0.1 \
    crate://crates.io/gix-trace/0.1.17 \
    crate://crates.io/gix-transport/0.52.1 \
    crate://crates.io/gix-traverse/0.51.1 \
    crate://crates.io/gix-url/0.34.0 \
    crate://crates.io/gix-utils/0.3.1 \
    crate://crates.io/gix-validate/0.10.1 \
    crate://crates.io/gix-worktree-state/0.24.0 \
    crate://crates.io/gix-worktree/0.46.0 \
    crate://crates.io/gix/0.77.0 \
    crate://crates.io/globset/0.4.18 \
    crate://crates.io/goblin/0.10.4 \
    crate://crates.io/h2/0.4.13 \
    crate://crates.io/hash32/0.3.1 \
    crate://crates.io/hashbrown/0.15.5 \
    crate://crates.io/hashbrown/0.16.1 \
    crate://crates.io/heapless/0.8.0 \
    crate://crates.io/heck/0.5.0 \
    crate://crates.io/home/0.5.12 \
    crate://crates.io/http-body-util/0.1.3 \
    crate://crates.io/http-body/1.0.1 \
    crate://crates.io/http/1.4.0 \
    crate://crates.io/httparse/1.10.1 \
    crate://crates.io/hyper-rustls/0.27.7 \
    crate://crates.io/hyper-util/0.1.19 \
    crate://crates.io/hyper/1.8.1 \
    crate://crates.io/icu_collections/2.1.1 \
    crate://crates.io/icu_locale_core/2.1.1 \
    crate://crates.io/icu_normalizer/2.1.1 \
    crate://crates.io/icu_normalizer_data/2.1.1 \
    crate://crates.io/icu_properties/2.1.2 \
    crate://crates.io/icu_properties_data/2.1.2 \
    crate://crates.io/icu_provider/2.1.1 \
    crate://crates.io/idna/1.1.0 \
    crate://crates.io/idna_adapter/1.2.1 \
    crate://crates.io/indexmap/2.12.1 \
    crate://crates.io/insta/1.46.0 \
    crate://crates.io/io-close/0.3.7 \
    crate://crates.io/ipnet/2.11.0 \
    crate://crates.io/iri-string/0.7.10 \
    crate://crates.io/is_terminal_polyfill/1.70.2 \
    crate://crates.io/itoa/1.0.17 \
    crate://crates.io/jiff-static/0.2.18 \
    crate://crates.io/jiff-tzdb-platform/0.1.3 \
    crate://crates.io/jiff-tzdb/0.1.5 \
    crate://crates.io/jiff/0.2.18 \
    crate://crates.io/jni-sys/0.3.0 \
    crate://crates.io/jni/0.21.1 \
    crate://crates.io/jobserver/0.1.34 \
    crate://crates.io/js-sys/0.3.83 \
    crate://crates.io/krates/0.20.0 \
    crate://crates.io/kstring/2.0.2 \
    crate://crates.io/libc/0.2.179 \
    crate://crates.io/libredox/0.1.12 \
    crate://crates.io/linux-raw-sys/0.11.0 \
    crate://crates.io/litemap/0.8.1 \
    crate://crates.io/lock_api/0.4.14 \
    crate://crates.io/log/0.4.29 \
    crate://crates.io/maybe-async/0.2.10 \
    crate://crates.io/memchr/2.7.6 \
    crate://crates.io/memmap2/0.9.9 \
    crate://crates.io/mime/0.3.17 \
    crate://crates.io/miniz_oxide/0.8.9 \
    crate://crates.io/mio/1.1.1 \
    crate://crates.io/nu-ansi-term/0.50.3 \
    crate://crates.io/num-conv/0.1.0 \
    crate://crates.io/once_cell/1.21.3 \
    crate://crates.io/once_cell_polyfill/1.70.2 \
    crate://crates.io/openssl-probe/0.2.0 \
    crate://crates.io/parking_lot/0.12.5 \
    crate://crates.io/parking_lot_core/0.9.12 \
    crate://crates.io/percent-encoding/2.3.2 \
    crate://crates.io/petgraph/0.8.3 \
    crate://crates.io/pin-project-lite/0.2.16 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.32 \
    crate://crates.io/plain/0.2.3 \
    crate://crates.io/platforms/3.7.0 \
    crate://crates.io/portable-atomic-util/0.2.4 \
    crate://crates.io/portable-atomic/1.13.0 \
    crate://crates.io/potential_utf/0.1.4 \
    crate://crates.io/powerfmt/0.2.0 \
    crate://crates.io/proc-macro2/1.0.105 \
    crate://crates.io/prodash/30.0.1 \
    crate://crates.io/quote/1.0.43 \
    crate://crates.io/r-efi/5.3.0 \
    crate://crates.io/radium/0.7.0 \
    crate://crates.io/rayon-core/1.13.0 \
    crate://crates.io/rayon/1.11.0 \
    crate://crates.io/redox_syscall/0.5.18 \
    crate://crates.io/redox_syscall/0.7.0 \
    crate://crates.io/regex-automata/0.4.13 \
    crate://crates.io/regex-syntax/0.8.8 \
    crate://crates.io/regex/1.12.2 \
    crate://crates.io/reqwest/0.13.1 \
    crate://crates.io/ring/0.17.14 \
    crate://crates.io/rustc-stable-hash/0.1.2 \
    crate://crates.io/rustix/1.1.3 \
    crate://crates.io/rustls-native-certs/0.8.3 \
    crate://crates.io/rustls-pki-types/1.13.2 \
    crate://crates.io/rustls-platform-verifier-android/0.1.1 \
    crate://crates.io/rustls-platform-verifier/0.6.2 \
    crate://crates.io/rustls-webpki/0.103.8 \
    crate://crates.io/rustls/0.23.36 \
    crate://crates.io/rustsec/0.31.0 \
    crate://crates.io/rustversion/1.0.22 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/schannel/0.1.28 \
    crate://crates.io/scopeguard/1.2.0 \
    crate://crates.io/scroll/0.13.0 \
    crate://crates.io/scroll_derive/0.13.1 \
    crate://crates.io/security-framework-sys/2.15.0 \
    crate://crates.io/security-framework/3.5.1 \
    crate://crates.io/semver/1.0.27 \
    crate://crates.io/serde/1.0.228 \
    crate://crates.io/serde_core/1.0.228 \
    crate://crates.io/serde_derive/1.0.228 \
    crate://crates.io/serde_json/1.0.149 \
    crate://crates.io/serde_spanned/1.0.4 \
    crate://crates.io/sha1-checked/0.10.0 \
    crate://crates.io/sha1/0.10.6 \
    crate://crates.io/sha2/0.10.9 \
    crate://crates.io/shell-words/1.1.1 \
    crate://crates.io/shlex/1.3.0 \
    crate://crates.io/signal-hook-registry/1.4.8 \
    crate://crates.io/signal-hook/0.3.18 \
    crate://crates.io/signal-hook/0.4.1 \
    crate://crates.io/simd-adler32/0.3.8 \
    crate://crates.io/similar/2.7.0 \
    crate://crates.io/slab/0.4.11 \
    crate://crates.io/smallvec/1.15.1 \
    crate://crates.io/smol_str/0.3.2 \
    crate://crates.io/socket2/0.6.1 \
    crate://crates.io/spdx/0.13.3 \
    crate://crates.io/stable_deref_trait/1.2.1 \
    crate://crates.io/static_assertions/1.1.0 \
    crate://crates.io/strsim/0.11.1 \
    crate://crates.io/strum/0.27.2 \
    crate://crates.io/strum_macros/0.27.2 \
    crate://crates.io/subtle/2.6.1 \
    crate://crates.io/syn/2.0.114 \
    crate://crates.io/sync_wrapper/1.0.2 \
    crate://crates.io/synstructure/0.13.2 \
    crate://crates.io/tame-index/0.26.0 \
    crate://crates.io/tap/1.0.1 \
    crate://crates.io/target-lexicon/0.13.3 \
    crate://crates.io/tempfile/3.24.0 \
    crate://crates.io/termcolor/1.4.1 \
    crate://crates.io/thiserror-impl/1.0.69 \
    crate://crates.io/thiserror-impl/2.0.17 \
    crate://crates.io/thiserror/1.0.69 \
    crate://crates.io/thiserror/2.0.17 \
    crate://crates.io/time-core/0.1.6 \
    crate://crates.io/time-macros/0.2.24 \
    crate://crates.io/time/0.3.44 \
    crate://crates.io/tinystr/0.8.2 \
    crate://crates.io/tinyvec/1.10.0 \
    crate://crates.io/tinyvec_macros/0.1.1 \
    crate://crates.io/tokio-rustls/0.26.4 \
    crate://crates.io/tokio-util/0.7.18 \
    crate://crates.io/tokio/1.49.0 \
    crate://crates.io/toml-span/0.6.0 \
    crate://crates.io/toml/0.9.10+spec-1.1.0 \
    crate://crates.io/toml_datetime/0.7.5+spec-1.1.0 \
    crate://crates.io/toml_parser/1.0.6+spec-1.1.0 \
    crate://crates.io/toml_writer/1.0.6+spec-1.1.0 \
    crate://crates.io/tower-http/0.6.8 \
    crate://crates.io/tower-layer/0.3.3 \
    crate://crates.io/tower-service/0.3.3 \
    crate://crates.io/tower/0.5.2 \
    crate://crates.io/tracing-core/0.1.36 \
    crate://crates.io/tracing/0.1.44 \
    crate://crates.io/try-lock/0.2.5 \
    crate://crates.io/twox-hash/2.1.2 \
    crate://crates.io/typenum/1.19.0 \
    crate://crates.io/unicode-bom/2.0.3 \
    crate://crates.io/unicode-ident/1.0.22 \
    crate://crates.io/unicode-normalization/0.1.25 \
    crate://crates.io/unicode-width/0.2.2 \
    crate://crates.io/untrusted/0.9.0 \
    crate://crates.io/url/2.5.8 \
    crate://crates.io/utf8_iter/1.0.4 \
    crate://crates.io/utf8parse/0.2.2 \
    crate://crates.io/version_check/0.9.5 \
    crate://crates.io/walkdir/2.5.0 \
    crate://crates.io/want/0.3.1 \
    crate://crates.io/wasi/0.11.1+wasi-snapshot-preview1 \
    crate://crates.io/wasip2/1.0.1+wasi-0.2.4 \
    crate://crates.io/wasm-bindgen-futures/0.4.56 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.106 \
    crate://crates.io/wasm-bindgen-macro/0.2.106 \
    crate://crates.io/wasm-bindgen-shared/0.2.106 \
    crate://crates.io/wasm-bindgen/0.2.106 \
    crate://crates.io/web-sys/0.3.83 \
    crate://crates.io/webpki-root-certs/1.0.5 \
    crate://crates.io/webpki-roots/1.0.5 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.11 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-link/0.2.1 \
    crate://crates.io/windows-sys/0.45.0 \
    crate://crates.io/windows-sys/0.52.0 \
    crate://crates.io/windows-sys/0.59.0 \
    crate://crates.io/windows-sys/0.60.2 \
    crate://crates.io/windows-sys/0.61.2 \
    crate://crates.io/windows-targets/0.42.2 \
    crate://crates.io/windows-targets/0.52.6 \
    crate://crates.io/windows-targets/0.53.5 \
    crate://crates.io/windows_aarch64_gnullvm/0.42.2 \
    crate://crates.io/windows_aarch64_gnullvm/0.52.6 \
    crate://crates.io/windows_aarch64_gnullvm/0.53.1 \
    crate://crates.io/windows_aarch64_msvc/0.42.2 \
    crate://crates.io/windows_aarch64_msvc/0.52.6 \
    crate://crates.io/windows_aarch64_msvc/0.53.1 \
    crate://crates.io/windows_i686_gnu/0.42.2 \
    crate://crates.io/windows_i686_gnu/0.52.6 \
    crate://crates.io/windows_i686_gnu/0.53.1 \
    crate://crates.io/windows_i686_gnullvm/0.52.6 \
    crate://crates.io/windows_i686_gnullvm/0.53.1 \
    crate://crates.io/windows_i686_msvc/0.42.2 \
    crate://crates.io/windows_i686_msvc/0.52.6 \
    crate://crates.io/windows_i686_msvc/0.53.1 \
    crate://crates.io/windows_x86_64_gnu/0.42.2 \
    crate://crates.io/windows_x86_64_gnu/0.52.6 \
    crate://crates.io/windows_x86_64_gnu/0.53.1 \
    crate://crates.io/windows_x86_64_gnullvm/0.42.2 \
    crate://crates.io/windows_x86_64_gnullvm/0.52.6 \
    crate://crates.io/windows_x86_64_gnullvm/0.53.1 \
    crate://crates.io/windows_x86_64_msvc/0.42.2 \
    crate://crates.io/windows_x86_64_msvc/0.52.6 \
    crate://crates.io/windows_x86_64_msvc/0.53.1 \
    crate://crates.io/winnow/0.7.14 \
    crate://crates.io/wit-bindgen/0.46.0 \
    crate://crates.io/writeable/0.6.2 \
    crate://crates.io/wyz/0.5.1 \
    crate://crates.io/yoke-derive/0.8.1 \
    crate://crates.io/yoke/0.8.1 \
    crate://crates.io/zerofrom-derive/0.1.6 \
    crate://crates.io/zerofrom/0.1.6 \
    crate://crates.io/zeroize/1.8.2 \
    crate://crates.io/zerotrie/0.2.3 \
    crate://crates.io/zerovec-derive/0.11.2 \
    crate://crates.io/zerovec/0.11.5 \
    crate://crates.io/zlib-rs/0.5.5 \
    crate://crates.io/zmij/1.0.12 \
    crate://crates.io/zstd-safe/7.2.4 \
    crate://crates.io/zstd-sys/2.0.16+zstd.1.5.7 \
    crate://crates.io/zstd/0.13.3 \
"

SRC_URI[adler2-2.0.1.sha256sum] = "320119579fcad9c21884f5c4861d16174d0e06250625266f50fe6898340abefa"
SRC_URI[aho-corasick-1.1.4.sha256sum] = "ddd31a130427c27518df266943a5308ed92d4b226cc639f5a8f1002816174301"
SRC_URI[allocator-api2-0.2.21.sha256sum] = "683d7910e743518b0e34f1186f92494becacb047c7b6bf616c96772180fef923"
SRC_URI[anstream-0.6.21.sha256sum] = "43d5b281e737544384e969a5ccad3f1cdd24b48086a0fc1b2a5262a26b8f4f4a"
SRC_URI[anstyle-1.0.13.sha256sum] = "5192cca8006f1fd4f7237516f40fa183bb07f8fbdfedaa0036de5ea9b0b45e78"
SRC_URI[anstyle-parse-0.2.7.sha256sum] = "4e7644824f0aa2c7b9384579234ef10eb7efb6a0deb83f9630a49594dd9c15c2"
SRC_URI[anstyle-query-1.1.5.sha256sum] = "40c48f72fd53cd289104fc64099abca73db4166ad86ea0b4341abe65af83dadc"
SRC_URI[anstyle-wincon-3.0.11.sha256sum] = "291e6a250ff86cd4a820112fb8898808a366d8f9f58ce16d1f538353ad55747d"
SRC_URI[anyhow-1.0.100.sha256sum] = "a23eb6b1614318a8071c9b2521f36b424b2c83db5eb3a0fead4a6c0809af6e61"
SRC_URI[arc-swap-1.8.0.sha256sum] = "51d03449bb8ca2cc2ef70869af31463d1ae5ccc8fa3e334b307203fbf815207e"
SRC_URI[async-compression-0.4.36.sha256sum] = "98ec5f6c2f8bc326c994cb9e241cc257ddaba9afa8555a43cffbb5dd86efaa37"
SRC_URI[atomic-waker-1.1.2.sha256sum] = "1505bd5d3d116872e7271a6d4e16d81d0c8570876c8de68093a09ac269d8aac0"
SRC_URI[autocfg-1.5.0.sha256sum] = "c08606f8c3cbf4ce6ec8e28fb0014a2c086708fe954eaa885384a6165172e7e8"
SRC_URI[base64-0.22.1.sha256sum] = "72b3254f16251a8381aa12e40e3c4d2f0199f8c6508fbecb9d91f575e0fbb8c6"
SRC_URI[bitflags-2.10.0.sha256sum] = "812e12b5285cc515a9c72a5c1d3b6d46a19dac5acfef5265968c166106e31dd3"
SRC_URI[bitvec-1.0.1.sha256sum] = "1bc2832c24239b0141d5674bb9174f9d68a8b5b3f2753311927c172ca46f7e9c"
SRC_URI[block-buffer-0.10.4.sha256sum] = "3078c7629b62d3f0439517fa394996acacc5cbc91c5a20d8c658e77abd503a71"
SRC_URI[borsh-1.6.0.sha256sum] = "d1da5ab77c1437701eeff7c88d968729e7766172279eab0676857b3d63af7a6f"
SRC_URI[bstr-1.12.1.sha256sum] = "63044e1ae8e69f3b5a92c736ca6269b8d12fa7efe39bf34ddb06d102cf0e2cab"
SRC_URI[bumpalo-3.19.1.sha256sum] = "5dd9dc738b7a8311c7ade152424974d8115f2cdad61e8dab8dac9f2362298510"
SRC_URI[byteorder-1.5.0.sha256sum] = "1fd0f2584146f6f2ef48085050886acf353beff7305ebd1ae69500e27c67f64b"
SRC_URI[bytes-1.11.0.sha256sum] = "b35204fbdc0b3f4446b89fc1ac2cf84a8a68971995d0bf2e925ec7cd960f9cb3"
SRC_URI[camino-1.2.2.sha256sum] = "e629a66d692cb9ff1a1c664e41771b3dcaf961985a9774c0eb0bd1b51cf60a48"
SRC_URI[cargo-lock-11.0.0.sha256sum] = "cf53e0ebbbc6e45357b199f3b213f3eb330792c8b370e548499f5685470ecb11"
SRC_URI[cc-1.2.51.sha256sum] = "7a0aeaff4ff1a90589618835a598e545176939b97874f7abc7851caa0618f203"
SRC_URI[cesu8-1.1.0.sha256sum] = "6d43a04d8753f35258c91f8ec639f792891f748a1edbd759cf1dcea3382ad83c"
SRC_URI[cfg-expr-0.20.5.sha256sum] = "21be0e1ce6cdb2ee7fff840f922fb04ead349e5cfb1e750b769132d44ce04720"
SRC_URI[cfg-if-1.0.4.sha256sum] = "9330f8b2ff13f34540b44e946ef35111825727b38d33286ef986142615121801"
SRC_URI[cfg_aliases-0.2.1.sha256sum] = "613afe47fcd5fac7ccf1db93babcb082c5994d996f20b8b159f2ad1658eb5724"
SRC_URI[clap-4.5.54.sha256sum] = "c6e6ff9dcd79cff5cd969a17a545d79e84ab086e444102a591e288a8aa3ce394"
SRC_URI[clap_builder-4.5.54.sha256sum] = "fa42cf4d2b7a41bc8f663a7cab4031ebafa1bf3875705bfaf8466dc60ab52c00"
SRC_URI[clap_derive-4.5.49.sha256sum] = "2a0b5487afeab2deb2ff4e03a807ad1a03ac532ff5a2cee5d86884440c7f7671"
SRC_URI[clap_lex-0.7.6.sha256sum] = "a1d728cc89cf3aee9ff92b05e62b19ee65a02b5702cff7d5a377e32c6ae29d8d"
SRC_URI[clru-0.6.2.sha256sum] = "cbd0f76e066e64fdc5631e3bb46381254deab9ef1158292f27c8c57e3bf3fe59"
SRC_URI[codespan-0.13.1.sha256sum] = "583f52b0658b321b25fd6b209b6c76cf058f433071297de64e5980c3d9aad937"
SRC_URI[codespan-reporting-0.13.1.sha256sum] = "af491d569909a7e4dee0ad7db7f5341fef5c614d5b8ec8cf765732aba3cff681"
SRC_URI[colorchoice-1.0.4.sha256sum] = "b05b61dc5112cbb17e4b6cd61790d9845d13888356391624cbe7e41efeac1e75"
SRC_URI[combine-4.6.7.sha256sum] = "ba5a308b75df32fe02788e748662718f03fde005016435c444eea572398219fd"
SRC_URI[compression-codecs-0.4.35.sha256sum] = "b0f7ac3e5b97fdce45e8922fb05cae2c37f7bbd63d30dd94821dacfd8f3f2bf2"
SRC_URI[compression-core-0.4.31.sha256sum] = "75984efb6ed102a0d42db99afb6c1948f0380d1d91808d5529916e6c08b49d8d"
SRC_URI[console-0.15.11.sha256sum] = "054ccb5b10f9f2cbf51eb355ca1d05c2d279ce1804688d0db74b4733a5aeafd8"
SRC_URI[core-foundation-0.10.1.sha256sum] = "b2a6cd9ae233e7f62ba4e9353e81a88df7fc8a5987b8d445b4d90c879bd156f6"
SRC_URI[core-foundation-sys-0.8.7.sha256sum] = "773648b94d0e5d620f64f280777445740e61fe701025087ec8b57f45c791888b"
SRC_URI[cpufeatures-0.2.17.sha256sum] = "59ed5838eebb26a2bb2e58f6d5b5316989ae9d08bab10e0e6d103e656d1b0280"
SRC_URI[crc32fast-1.5.0.sha256sum] = "9481c1c90cbf2ac953f07c8d4a58aa3945c425b7185c9154d67a65e4230da511"
SRC_URI[crossbeam-0.8.4.sha256sum] = "1137cd7e7fc0fb5d3c5a8678be38ec56e819125d8d7907411fe24ccb943faca8"
SRC_URI[crossbeam-channel-0.5.15.sha256sum] = "82b8f8f868b36967f9606790d1903570de9ceaf870a7bf9fbbd3016d636a2cb2"
SRC_URI[crossbeam-deque-0.8.6.sha256sum] = "9dd111b7b7f7d55b72c0a6ae361660ee5853c9af73f70c3c2ef6858b950e2e51"
SRC_URI[crossbeam-epoch-0.9.18.sha256sum] = "5b82ac4a3c2ca9c3460964f020e1402edd5753411d7737aa39c3714ad1b5420e"
SRC_URI[crossbeam-queue-0.3.12.sha256sum] = "0f58bbc28f91df819d0aa2a2c00cd19754769c2fad90579b3592b1c9ba7a3115"
SRC_URI[crossbeam-utils-0.8.21.sha256sum] = "d0a5c400df2834b80a4c3327b3aad3a4c4cd4de0629063962b03235697506a28"
SRC_URI[crypto-common-0.1.7.sha256sum] = "78c8292055d1c1df0cce5d180393dc8cce0abec0a7102adb6c7b1eef6016d60a"
SRC_URI[cvss-2.2.0.sha256sum] = "f7fb220d3ce1b565af39cee5b89e47fd8dd1dab162900ee4363c8ee4169ee8a2"
SRC_URI[deranged-0.5.5.sha256sum] = "ececcb659e7ba858fb4f10388c250a7252eb0a27373f1a72b8748afdd248e587"
SRC_URI[digest-0.10.7.sha256sum] = "9ed9a281f7bc9b7576e61468ba615a66a5c8cfdff42420a70aa82701a3b1e292"
SRC_URI[displaydoc-0.2.5.sha256sum] = "97369cbbc041bc366949bc74d34658d6cda5621039731c6310521892a3a20ae0"
SRC_URI[dunce-1.0.5.sha256sum] = "92773504d58c093f6de2459af4af33faa518c13451eb8f2b5698ed3d36e7c813"
SRC_URI[either-1.15.0.sha256sum] = "48c757948c5ede0e46177b7add2e67155f70e33c07fea8284df6576da70b3719"
SRC_URI[encode_unicode-1.0.0.sha256sum] = "34aa73646ffb006b8f5147f3dc182bd4bcb190227ce861fc4a4844bf8e3cb2c0"
SRC_URI[encoding_rs-0.8.35.sha256sum] = "75030f3c4f45dafd7586dd6780965a8c7e8e285a5ecb86713e63a79c5b2766f3"
SRC_URI[equivalent-1.0.2.sha256sum] = "877a4ace8713b0bcf2a4e7eec82529c029f1d0619886d18145fea96c3ffe5c0f"
SRC_URI[errno-0.3.14.sha256sum] = "39cab71617ae0d63f51a36d69f866391735b51691dbda63cf6f96d042b63efeb"
SRC_URI[faster-hex-0.10.0.sha256sum] = "7223ae2d2f179b803433d9c830478527e92b8117eab39460edae7f1614d9fb73"
SRC_URI[fastrand-2.3.0.sha256sum] = "37909eebbb50d72f9059c3b6d82c0463f2ff062c9e95845c43a6c9c0355411be"
SRC_URI[fern-0.7.1.sha256sum] = "4316185f709b23713e41e3195f90edef7fb00c3ed4adc79769cf09cc762a3b29"
SRC_URI[filetime-0.2.26.sha256sum] = "bc0505cd1b6fa6580283f6bdf70a73fcf4aba1184038c90902b92b3dd0df63ed"
SRC_URI[find-msvc-tools-0.1.6.sha256sum] = "645cbb3a84e60b7531617d5ae4e57f7e27308f6445f5abf653209ea76dec8dff"
SRC_URI[fixedbitset-0.5.7.sha256sum] = "1d674e81391d1e1ab681a28d99df07927c6d4aa5b027d7da16ba32d1d21ecd99"
SRC_URI[flate2-1.1.5.sha256sum] = "bfe33edd8e85a12a67454e37f8c75e730830d83e313556ab9ebf9ee7fbeb3bfb"
SRC_URI[fnv-1.0.7.sha256sum] = "3f9eec918d3f24069decb9af1554cad7c880e2da24a9afd88aca000531ab82c1"
SRC_URI[foldhash-0.1.5.sha256sum] = "d9c4f5dac5e15c24eb999c26181a6ca40b39fe946cbe4c263c7209467bc83af2"
SRC_URI[foldhash-0.2.0.sha256sum] = "77ce24cb58228fbb8aa041425bb1050850ac19177686ea6e0f41a70416f56fdb"
SRC_URI[form_urlencoded-1.2.2.sha256sum] = "cb4cb245038516f5f85277875cdaa4f7d2c9a0fa0468de06ed190163b1581fcf"
SRC_URI[fs-err-3.2.2.sha256sum] = "baf68cef89750956493a66a10f512b9e58d9db21f2a573c079c0bdf1207a54a7"
SRC_URI[fs_extra-1.3.0.sha256sum] = "42703706b716c37f96a77aea830392ad231f44c9e9a67872fa5548707e11b11c"
SRC_URI[funty-2.0.0.sha256sum] = "e6d5a32815ae3f33302d95fdcb2ce17862f8c65363dcfd29360480ba1001fc9c"
SRC_URI[futures-channel-0.3.31.sha256sum] = "2dff15bf788c671c1934e366d07e30c1814a8ef514e1af724a602e8a2fbe1b10"
SRC_URI[futures-core-0.3.31.sha256sum] = "05f29059c0c2090612e8d742178b0580d2dc940c837851ad723096f87af6663e"
SRC_URI[futures-io-0.3.31.sha256sum] = "9e5c1b78ca4aae1ac06c48a526a655760685149f0d465d21f37abfe57ce075c6"
SRC_URI[futures-sink-0.3.31.sha256sum] = "e575fab7d1e0dcb8d0c7bcf9a63ee213816ab51902e6d244a95819acacf1d4f7"
SRC_URI[futures-task-0.3.31.sha256sum] = "f90f7dce0722e95104fcb095585910c0977252f286e354b5e3bd38902cd99988"
SRC_URI[futures-util-0.3.31.sha256sum] = "9fa08315bb612088cc391249efdc3bc77536f16c91f6cf495e6fbe85b20a4a81"
SRC_URI[generic-array-0.14.7.sha256sum] = "85649ca51fd72272d7821adaf274ad91c288277713d9c18820d8499a7ff69e9a"
SRC_URI[getrandom-0.2.16.sha256sum] = "335ff9f135e4384c8150d6f27c6daed433577f86b4750418338c01a1a2528592"
SRC_URI[getrandom-0.3.4.sha256sum] = "899def5c37c4fd7b2664648c28120ecec138e4d395b459e5ca34f9cce2dd77fd"
SRC_URI[gix-0.77.0.sha256sum] = "3d8284d86a2f5c0987fbf7219a128815cc04af5a18f5fd7eec6a76d83c2b78cc"
SRC_URI[gix-actor-0.37.1.sha256sum] = "c345528d405eab51d20f505f5fe1a4680973953694e0292c6bbe97827daa55c4"
SRC_URI[gix-attributes-0.29.0.sha256sum] = "f47dabf8a50f1558c3a55d978440c7c4f22f87ac897bef03b4edbc96f6115966"
SRC_URI[gix-bitmap-0.2.15.sha256sum] = "5e150161b8a75b5860521cb876b506879a3376d3adc857ec7a9d35e7c6a5e531"
SRC_URI[gix-chunk-0.4.12.sha256sum] = "5c356b3825677cb6ff579551bb8311a81821e184453cbd105e2fc5311b288eeb"
SRC_URI[gix-command-0.6.5.sha256sum] = "46f9c425730a654835351e6da8c3c69ba1804f8b8d4e96d027254151138d5c64"
SRC_URI[gix-commitgraph-0.31.0.sha256sum] = "efdcba8048045baf15225daf949d597c3e6183d130245e22a7fbd27084abe63a"
SRC_URI[gix-config-0.50.0.sha256sum] = "b58e2ff8eef96b71f2c5e260f02ca0475caff374027c5cc5a29bda69fac67404"
SRC_URI[gix-config-value-0.16.0.sha256sum] = "2409cffa4fe8b303847d5b6ba8df9da9ba65d302fc5ee474ea0cac5afde79840"
SRC_URI[gix-credentials-0.34.1.sha256sum] = "316a12842fb761a7a6e9ae963d7bae9f0f4c433f242282df91192ef084b1891c"
SRC_URI[gix-date-0.12.1.sha256sum] = "fe4a31bab8159e233094fa70d2e5fd3ec6f19e593f67e6ae01281daa48f8d8e7"
SRC_URI[gix-diff-0.57.1.sha256sum] = "3506936e63ce14cd54b5f28ed06c8e43b92ef9f41c2238cc0bc271a9259b4e90"
SRC_URI[gix-discover-0.45.0.sha256sum] = "42ce096dc132533802a09d6fd5d4008858f2038341dfe2e69e0d0239edb359de"
SRC_URI[gix-features-0.45.2.sha256sum] = "d56aad357ae016449434705033df644ac6253dfcf1281aad3af3af9e907560d1"
SRC_URI[gix-filter-0.24.1.sha256sum] = "10c02464962482570c1f94ad451a608c4391514f803e8074662d02c5629a25dc"
SRC_URI[gix-fs-0.18.2.sha256sum] = "785b9c499e46bc78d7b81c148c21b3fca18655379ee729a856ed19ce50d359ec"
SRC_URI[gix-glob-0.23.0.sha256sum] = "e8546300aee4c65c5862c22a3e321124a69b654a61a8b60de546a9284812b7e2"
SRC_URI[gix-hash-0.21.2.sha256sum] = "e153930f42ccdab8a3306b1027cd524879f6a8996cd0c474d18b0e56cae7714d"
SRC_URI[gix-hashtable-0.11.0.sha256sum] = "222f7428636020bef272a87ed833ea48bf5fb3193f99852ae16fbb5a602bd2f0"
SRC_URI[gix-ignore-0.18.0.sha256sum] = "dfa727fdf54fd9fb53fa3fbb1a5c17172d3073e8e336bf155f3cac3e25b81b21"
SRC_URI[gix-index-0.45.1.sha256sum] = "9ea6d3e9e11647ba49f441dea0782494cc6d2875ff43fa4ad9094e6957f42051"
SRC_URI[gix-lock-20.0.1.sha256sum] = "115268ae5e3b3b7bc7fc77260eecee05acca458e45318ca45d35467fa81a3ac5"
SRC_URI[gix-negotiate-0.25.0.sha256sum] = "f3cee7e32e6198e356caef0e4b8321bc2f9b2afeb76f870c0bf9aa05fe53edb6"
SRC_URI[gix-object-0.54.1.sha256sum] = "363d6a879c52e4890180e0ffa7d8c9a364fd0b7e807caa368e860b80e8d0bc81"
SRC_URI[gix-odb-0.74.0.sha256sum] = "165a907df369a12ed4330faf8baf7ae597aadb08cfacb4ed8649f93d90bcc0c5"
SRC_URI[gix-pack-0.64.1.sha256sum] = "b04a73d5ab07ea0faae55e2c0ae6f24e36e365ac8ce140394dee3a2c89cd4366"
SRC_URI[gix-packetline-0.20.0.sha256sum] = "fad0ffb982a289888087a165d3e849cbac724f2aa5431236b050dd2cb9c7de31"
SRC_URI[gix-path-0.10.22.sha256sum] = "7cb06c3e4f8eed6e24fd915fa93145e28a511f4ea0e768bae16673e05ed3f366"
SRC_URI[gix-pathspec-0.14.0.sha256sum] = "ed9e0c881933c37a7ef45288d6c5779c4a7b3ad240b4c37657e1d9829eb90085"
SRC_URI[gix-prompt-0.12.0.sha256sum] = "974b142ea650fb0050a301958f49c8cc68929c36f686e9606a381ce39da34fd9"
SRC_URI[gix-protocol-0.55.0.sha256sum] = "02c5dfd068789442c5709e702ef42d851765f2c09a11bf0a13749d24363f4d07"
SRC_URI[gix-quote-0.6.1.sha256sum] = "e912ec04b7b1566a85ad486db0cab6b9955e3e32bcd3c3a734542ab3af084c5b"
SRC_URI[gix-ref-0.57.0.sha256sum] = "ccb33aa97006e37e9e83fde233569a66b02ed16fd4b0406cdf35834b06cf8a63"
SRC_URI[gix-refspec-0.35.0.sha256sum] = "dcbba6ae5389f4021f73a2d62a4195aace7db1e8bb684b25521d3d685f57da02"
SRC_URI[gix-revision-0.39.0.sha256sum] = "91898c83b18c635696f7355d171cfa74a52f38022ff89581f567768935ebc4c8"
SRC_URI[gix-revwalk-0.25.0.sha256sum] = "0d063699278485016863d0d2bb0db7609fd2e8ba9a89379717bf06fd96949eb2"
SRC_URI[gix-sec-0.12.2.sha256sum] = "ea9962ed6d9114f7f100efe038752f41283c225bb507a2888903ac593dffa6be"
SRC_URI[gix-shallow-0.7.0.sha256sum] = "9c1c467fb9f7ec1d33613c2ea5482de514bcb84b8222a793cdc4c71955832356"
SRC_URI[gix-submodule-0.24.0.sha256sum] = "efee2a61198413d80de10028aa507344537827d776ade781760130721bec2419"
SRC_URI[gix-tempfile-20.0.1.sha256sum] = "ad89218e74850f42d364ed3877c7291f0474c8533502df91bb877ecc5cb0dd40"
SRC_URI[gix-trace-0.1.17.sha256sum] = "6e42a4c2583357721ba2d887916e78df504980f22f1182df06997ce197b89504"
SRC_URI[gix-transport-0.52.1.sha256sum] = "a4d4ed02a2ebe771a26111896ecda0b98b58ed35e1d9c0ccf07251c1abb4918d"
SRC_URI[gix-traverse-0.51.1.sha256sum] = "d052b83d1d1744be95ac6448ac02f95f370a8f6720e466be9ce57146e39f5280"
SRC_URI[gix-url-0.34.0.sha256sum] = "cff1996dfb9430b3699d89224c674169c1ae355eacc52bf30a03c0b8bffe73d9"
SRC_URI[gix-utils-0.3.1.sha256sum] = "befcdbdfb1238d2854591f760a48711bed85e72d80a10e8f2f93f656746ef7c5"
SRC_URI[gix-validate-0.10.1.sha256sum] = "5b1e63a5b516e970a594f870ed4571a8fdcb8a344e7bd407a20db8bd61dbfde4"
SRC_URI[gix-worktree-0.46.0.sha256sum] = "1cfb7ce8cdbfe06117d335d1ad329351468d20331e0aafd108ceb647c1326aca"
SRC_URI[gix-worktree-state-0.24.0.sha256sum] = "7f34c19e29e0a359b97faaf92fdd053d4cc33aa0e69cabb30f0e120effe4ff3b"
SRC_URI[globset-0.4.18.sha256sum] = "52dfc19153a48bde0cbd630453615c8151bce3a5adfac7a0aebfbf0a1e1f57e3"
SRC_URI[goblin-0.10.4.sha256sum] = "4db6758c546e6f81f265638c980e5e84dfbda80cfd8e89e02f83454c8e8124bd"
SRC_URI[h2-0.4.13.sha256sum] = "2f44da3a8150a6703ed5d34e164b875fd14c2cdab9af1252a9a1020bde2bdc54"
SRC_URI[hash32-0.3.1.sha256sum] = "47d60b12902ba28e2730cd37e95b8c9223af2808df9e902d4df49588d1470606"
SRC_URI[hashbrown-0.15.5.sha256sum] = "9229cfe53dfd69f0609a49f65461bd93001ea1ef889cd5529dd176593f5338a1"
SRC_URI[hashbrown-0.16.1.sha256sum] = "841d1cc9bed7f9236f321df977030373f4a4163ae1a7dbfe1a51a2c1a51d9100"
SRC_URI[heapless-0.8.0.sha256sum] = "0bfb9eb618601c89945a70e254898da93b13be0388091d42117462b265bb3fad"
SRC_URI[heck-0.5.0.sha256sum] = "2304e00983f87ffb38b55b444b5e3b60a884b5d30c0fca7d82fe33449bbe55ea"
SRC_URI[home-0.5.12.sha256sum] = "cc627f471c528ff0c4a49e1d5e60450c8f6461dd6d10ba9dcd3a61d3dff7728d"
SRC_URI[http-1.4.0.sha256sum] = "e3ba2a386d7f85a81f119ad7498ebe444d2e22c2af0b86b069416ace48b3311a"
SRC_URI[http-body-1.0.1.sha256sum] = "1efedce1fb8e6913f23e0c92de8e62cd5b772a67e7b3946df930a62566c93184"
SRC_URI[http-body-util-0.1.3.sha256sum] = "b021d93e26becf5dc7e1b75b1bed1fd93124b374ceb73f43d4d4eafec896a64a"
SRC_URI[httparse-1.10.1.sha256sum] = "6dbf3de79e51f3d586ab4cb9d5c3e2c14aa28ed23d180cf89b4df0454a69cc87"
SRC_URI[hyper-1.8.1.sha256sum] = "2ab2d4f250c3d7b1c9fcdff1cece94ea4e2dfbec68614f7b87cb205f24ca9d11"
SRC_URI[hyper-rustls-0.27.7.sha256sum] = "e3c93eb611681b207e1fe55d5a71ecf91572ec8a6705cdb6857f7d8d5242cf58"
SRC_URI[hyper-util-0.1.19.sha256sum] = "727805d60e7938b76b826a6ef209eb70eaa1812794f9424d4a4e2d740662df5f"
SRC_URI[icu_collections-2.1.1.sha256sum] = "4c6b649701667bbe825c3b7e6388cb521c23d88644678e83c0c4d0a621a34b43"
SRC_URI[icu_locale_core-2.1.1.sha256sum] = "edba7861004dd3714265b4db54a3c390e880ab658fec5f7db895fae2046b5bb6"
SRC_URI[icu_normalizer-2.1.1.sha256sum] = "5f6c8828b67bf8908d82127b2054ea1b4427ff0230ee9141c54251934ab1b599"
SRC_URI[icu_normalizer_data-2.1.1.sha256sum] = "7aedcccd01fc5fe81e6b489c15b247b8b0690feb23304303a9e560f37efc560a"
SRC_URI[icu_properties-2.1.2.sha256sum] = "020bfc02fe870ec3a66d93e677ccca0562506e5872c650f893269e08615d74ec"
SRC_URI[icu_properties_data-2.1.2.sha256sum] = "616c294cf8d725c6afcd8f55abc17c56464ef6211f9ed59cccffe534129c77af"
SRC_URI[icu_provider-2.1.1.sha256sum] = "85962cf0ce02e1e0a629cc34e7ca3e373ce20dda4c4d7294bbd0bf1fdb59e614"
SRC_URI[idna-1.1.0.sha256sum] = "3b0875f23caa03898994f6ddc501886a45c7d3d62d04d2d90788d47be1b1e4de"
SRC_URI[idna_adapter-1.2.1.sha256sum] = "3acae9609540aa318d1bc588455225fb2085b9ed0c4f6bd0d9d5bcd86f1a0344"
SRC_URI[indexmap-2.12.1.sha256sum] = "0ad4bb2b565bca0645f4d68c5c9af97fba094e9791da685bf83cb5f3ce74acf2"
SRC_URI[insta-1.46.0.sha256sum] = "1b66886d14d18d420ab5052cbff544fc5d34d0b2cdd35eb5976aaa10a4a472e5"
SRC_URI[io-close-0.3.7.sha256sum] = "9cadcf447f06744f8ce713d2d6239bb5bde2c357a452397a9ed90c625da390bc"
SRC_URI[ipnet-2.11.0.sha256sum] = "469fb0b9cefa57e3ef31275ee7cacb78f2fdca44e4765491884a2b119d4eb130"
SRC_URI[iri-string-0.7.10.sha256sum] = "c91338f0783edbd6195decb37bae672fd3b165faffb89bf7b9e6942f8b1a731a"
SRC_URI[is_terminal_polyfill-1.70.2.sha256sum] = "a6cb138bb79a146c1bd460005623e142ef0181e3d0219cb493e02f7d08a35695"
SRC_URI[itoa-1.0.17.sha256sum] = "92ecc6618181def0457392ccd0ee51198e065e016d1d527a7ac1b6dc7c1f09d2"
SRC_URI[jiff-0.2.18.sha256sum] = "e67e8da4c49d6d9909fe03361f9b620f58898859f5c7aded68351e85e71ecf50"
SRC_URI[jiff-static-0.2.18.sha256sum] = "e0c84ee7f197eca9a86c6fd6cb771e55eb991632f15f2bc3ca6ec838929e6e78"
SRC_URI[jiff-tzdb-0.1.5.sha256sum] = "68971ebff725b9e2ca27a601c5eb38a4c5d64422c4cbab0c535f248087eda5c2"
SRC_URI[jiff-tzdb-platform-0.1.3.sha256sum] = "875a5a69ac2bab1a891711cf5eccbec1ce0341ea805560dcd90b7a2e925132e8"
SRC_URI[jni-0.21.1.sha256sum] = "1a87aa2bb7d2af34197c04845522473242e1aa17c12f4935d5856491a7fb8c97"
SRC_URI[jni-sys-0.3.0.sha256sum] = "8eaf4bc02d17cbdd7ff4c7438cafcdf7fb9a4613313ad11b4f8fefe7d3fa0130"
SRC_URI[jobserver-0.1.34.sha256sum] = "9afb3de4395d6b3e67a780b6de64b51c978ecf11cb9a462c66be7d4ca9039d33"
SRC_URI[js-sys-0.3.83.sha256sum] = "464a3709c7f55f1f721e5389aa6ea4e3bc6aba669353300af094b29ffbdde1d8"
SRC_URI[krates-0.20.0.sha256sum] = "c432bb7d7a968a338f6c7cbd8782f38ffd87a793ff06c3a20257f45e1d003f6d"
SRC_URI[kstring-2.0.2.sha256sum] = "558bf9508a558512042d3095138b1f7b8fe90c5467d94f9f1da28b3731c5dbd1"
SRC_URI[libc-0.2.179.sha256sum] = "c5a2d376baa530d1238d133232d15e239abad80d05838b4b59354e5268af431f"
SRC_URI[libredox-0.1.12.sha256sum] = "3d0b95e02c851351f877147b7deea7b1afb1df71b63aa5f8270716e0c5720616"
SRC_URI[linux-raw-sys-0.11.0.sha256sum] = "df1d3c3b53da64cf5760482273a98e575c651a67eec7f77df96b5b642de8f039"
SRC_URI[litemap-0.8.1.sha256sum] = "6373607a59f0be73a39b6fe456b8192fcc3585f602af20751600e974dd455e77"
SRC_URI[lock_api-0.4.14.sha256sum] = "224399e74b87b5f3557511d98dff8b14089b3dadafcab6bb93eab67d3aace965"
SRC_URI[log-0.4.29.sha256sum] = "5e5032e24019045c762d3c0f28f5b6b8bbf38563a65908389bf7978758920897"
SRC_URI[maybe-async-0.2.10.sha256sum] = "5cf92c10c7e361d6b99666ec1c6f9805b0bea2c3bd8c78dc6fe98ac5bd78db11"
SRC_URI[memchr-2.7.6.sha256sum] = "f52b00d39961fc5b2736ea853c9cc86238e165017a493d1d5c8eac6bdc4cc273"
SRC_URI[memmap2-0.9.9.sha256sum] = "744133e4a0e0a658e1374cf3bf8e415c4052a15a111acd372764c55b4177d490"
SRC_URI[mime-0.3.17.sha256sum] = "6877bb514081ee2a7ff5ef9de3281f14a4dd4bceac4c09388074a6b5df8a139a"
SRC_URI[miniz_oxide-0.8.9.sha256sum] = "1fa76a2c86f704bdb222d66965fb3d63269ce38518b83cb0575fca855ebb6316"
SRC_URI[mio-1.1.1.sha256sum] = "a69bcab0ad47271a0234d9422b131806bf3968021e5dc9328caf2d4cd58557fc"
SRC_URI[nu-ansi-term-0.50.3.sha256sum] = "7957b9740744892f114936ab4a57b3f487491bbeafaf8083688b16841a4240e5"
SRC_URI[num-conv-0.1.0.sha256sum] = "51d515d32fb182ee37cda2ccdcb92950d6a3c2893aa280e540671c2cd0f3b1d9"
SRC_URI[once_cell-1.21.3.sha256sum] = "42f5e15c9953c5e4ccceeb2e7382a716482c34515315f7b03532b8b4e8393d2d"
SRC_URI[once_cell_polyfill-1.70.2.sha256sum] = "384b8ab6d37215f3c5301a95a4accb5d64aa607f1fcb26a11b5303878451b4fe"
SRC_URI[openssl-probe-0.2.0.sha256sum] = "9f50d9b3dabb09ecd771ad0aa242ca6894994c130308ca3d7684634df8037391"
SRC_URI[parking_lot-0.12.5.sha256sum] = "93857453250e3077bd71ff98b6a65ea6621a19bb0f559a85248955ac12c45a1a"
SRC_URI[parking_lot_core-0.9.12.sha256sum] = "2621685985a2ebf1c516881c026032ac7deafcda1a2c9b7850dc81e3dfcb64c1"
SRC_URI[percent-encoding-2.3.2.sha256sum] = "9b4f627cb1b25917193a259e49bdad08f671f8d9708acfd5fe0a8c1455d87220"
SRC_URI[petgraph-0.8.3.sha256sum] = "8701b58ea97060d5e5b155d383a69952a60943f0e6dfe30b04c287beb0b27455"
SRC_URI[pin-project-lite-0.2.16.sha256sum] = "3b3cff922bd51709b605d9ead9aa71031d81447142d828eb4a6eba76fe619f9b"
SRC_URI[pin-utils-0.1.0.sha256sum] = "8b870d8c151b6f2fb93e84a13146138f05d02ed11c7e7c54f8826aaaf7c9f184"
SRC_URI[pkg-config-0.3.32.sha256sum] = "7edddbd0b52d732b21ad9a5fab5c704c14cd949e5e9a1ec5929a24fded1b904c"
SRC_URI[plain-0.2.3.sha256sum] = "b4596b6d070b27117e987119b4dac604f3c58cfb0b191112e24771b2faeac1a6"
SRC_URI[platforms-3.7.0.sha256sum] = "6f21de1852251c849a53467e0ce8b97cca9d11fd4efa3930145c5d5f02f24447"
SRC_URI[portable-atomic-1.13.0.sha256sum] = "f89776e4d69bb58bc6993e99ffa1d11f228b839984854c7daeb5d37f87cbe950"
SRC_URI[portable-atomic-util-0.2.4.sha256sum] = "d8a2f0d8d040d7848a709caf78912debcc3f33ee4b3cac47d73d1e1069e83507"
SRC_URI[potential_utf-0.1.4.sha256sum] = "b73949432f5e2a09657003c25bca5e19a0e9c84f8058ca374f49e0ebe605af77"
SRC_URI[powerfmt-0.2.0.sha256sum] = "439ee305def115ba05938db6eb1644ff94165c5ab5e9420d1c1bcedbba909391"
SRC_URI[proc-macro2-1.0.105.sha256sum] = "535d180e0ecab6268a3e718bb9fd44db66bbbc256257165fc699dadf70d16fe7"
SRC_URI[prodash-30.0.1.sha256sum] = "5a6efc566849d3d9d737c5cb06cc50e48950ebe3d3f9d70631490fff3a07b139"
SRC_URI[quote-1.0.43.sha256sum] = "dc74d9a594b72ae6656596548f56f667211f8a97b3d4c3d467150794690dc40a"
SRC_URI[r-efi-5.3.0.sha256sum] = "69cdb34c158ceb288df11e18b4bd39de994f6657d83847bdffdbd7f346754b0f"
SRC_URI[radium-0.7.0.sha256sum] = "dc33ff2d4973d518d823d61aa239014831e521c75da58e3df4840d3f47749d09"
SRC_URI[rayon-1.11.0.sha256sum] = "368f01d005bf8fd9b1206fb6fa653e6c4a81ceb1466406b81792d87c5677a58f"
SRC_URI[rayon-core-1.13.0.sha256sum] = "22e18b0f0062d30d4230b2e85ff77fdfe4326feb054b9783a3460d8435c8ab91"
SRC_URI[redox_syscall-0.5.18.sha256sum] = "ed2bf2547551a7053d6fdfafda3f938979645c44812fbfcda098faae3f1a362d"
SRC_URI[redox_syscall-0.7.0.sha256sum] = "49f3fe0889e69e2ae9e41f4d6c4c0181701d00e4697b356fb1f74173a5e0ee27"
SRC_URI[regex-1.12.2.sha256sum] = "843bc0191f75f3e22651ae5f1e72939ab2f72a4bc30fa80a066bd66edefc24d4"
SRC_URI[regex-automata-0.4.13.sha256sum] = "5276caf25ac86c8d810222b3dbb938e512c55c6831a10f3e6ed1c93b84041f1c"
SRC_URI[regex-syntax-0.8.8.sha256sum] = "7a2d987857b319362043e95f5353c0535c1f58eec5336fdfcf626430af7def58"
SRC_URI[reqwest-0.13.1.sha256sum] = "04e9018c9d814e5f30cc16a0f03271aeab3571e609612d9fe78c1aa8d11c2f62"
SRC_URI[ring-0.17.14.sha256sum] = "a4689e6c2294d81e88dc6261c768b63bc4fcdb852be6d1352498b114f61383b7"
SRC_URI[rustc-stable-hash-0.1.2.sha256sum] = "781442f29170c5c93b7185ad559492601acdc71d5bb0706f5868094f45cfcd08"
SRC_URI[rustix-1.1.3.sha256sum] = "146c9e247ccc180c1f61615433868c99f3de3ae256a30a43b49f67c2d9171f34"
SRC_URI[rustls-0.23.36.sha256sum] = "c665f33d38cea657d9614f766881e4d510e0eda4239891eea56b4cadcf01801b"
SRC_URI[rustls-native-certs-0.8.3.sha256sum] = "612460d5f7bea540c490b2b6395d8e34a953e52b491accd6c86c8164c5932a63"
SRC_URI[rustls-pki-types-1.13.2.sha256sum] = "21e6f2ab2928ca4291b86736a8bd920a277a399bba1589409d72154ff87c1282"
SRC_URI[rustls-platform-verifier-0.6.2.sha256sum] = "1d99feebc72bae7ab76ba994bb5e121b8d83d910ca40b36e0921f53becc41784"
SRC_URI[rustls-platform-verifier-android-0.1.1.sha256sum] = "f87165f0995f63a9fbeea62b64d10b4d9d8e78ec6d7d51fb2125fda7bb36788f"
SRC_URI[rustls-webpki-0.103.8.sha256sum] = "2ffdfa2f5286e2247234e03f680868ac2815974dc39e00ea15adc445d0aafe52"
SRC_URI[rustsec-0.31.0.sha256sum] = "f1648a26dcf2251d444d7c405ed4e227ac08552cdfb31bfc0145266fbec4138c"
SRC_URI[rustversion-1.0.22.sha256sum] = "b39cdef0fa800fc44525c84ccb54a029961a8215f9619753635a9c0d2538d46d"
SRC_URI[same-file-1.0.6.sha256sum] = "93fc1dc3aaa9bfed95e02e6eadabb4baf7e3078b0bd1b4d7b6b0b68378900502"
SRC_URI[schannel-0.1.28.sha256sum] = "891d81b926048e76efe18581bf793546b4c0eaf8448d72be8de2bbee5fd166e1"
SRC_URI[scopeguard-1.2.0.sha256sum] = "94143f37725109f92c262ed2cf5e59bce7498c01bcc1502d7b9afe439a4e9f49"
SRC_URI[scroll-0.13.0.sha256sum] = "c1257cd4248b4132760d6524d6dda4e053bc648c9070b960929bf50cfb1e7add"
SRC_URI[scroll_derive-0.13.1.sha256sum] = "ed76efe62313ab6610570951494bdaa81568026e0318eaa55f167de70eeea67d"
SRC_URI[security-framework-3.5.1.sha256sum] = "b3297343eaf830f66ede390ea39da1d462b6b0c1b000f420d0a83f898bbbe6ef"
SRC_URI[security-framework-sys-2.15.0.sha256sum] = "cc1f0cbffaac4852523ce30d8bd3c5cdc873501d96ff467ca09b6767bb8cd5c0"
SRC_URI[semver-1.0.27.sha256sum] = "d767eb0aabc880b29956c35734170f26ed551a859dbd361d140cdbeca61ab1e2"
SRC_URI[serde-1.0.228.sha256sum] = "9a8e94ea7f378bd32cbbd37198a4a91436180c5bb472411e48b5ec2e2124ae9e"
SRC_URI[serde_core-1.0.228.sha256sum] = "41d385c7d4ca58e59fc732af25c3983b67ac852c1a25000afe1175de458b67ad"
SRC_URI[serde_derive-1.0.228.sha256sum] = "d540f220d3187173da220f885ab66608367b6574e925011a9353e4badda91d79"
SRC_URI[serde_json-1.0.149.sha256sum] = "83fc039473c5595ace860d8c4fafa220ff474b3fc6bfdb4293327f1a37e94d86"
SRC_URI[serde_spanned-1.0.4.sha256sum] = "f8bbf91e5a4d6315eee45e704372590b30e260ee83af6639d64557f51b067776"
SRC_URI[sha1-0.10.6.sha256sum] = "e3bf829a2d51ab4a5ddf1352d8470c140cadc8301b2ae1789db023f01cedd6ba"
SRC_URI[sha1-checked-0.10.0.sha256sum] = "89f599ac0c323ebb1c6082821a54962b839832b03984598375bff3975b804423"
SRC_URI[sha2-0.10.9.sha256sum] = "a7507d819769d01a365ab707794a4084392c824f54a7a6a7862f8c3d0892b283"
SRC_URI[shell-words-1.1.1.sha256sum] = "dc6fe69c597f9c37bfeeeeeb33da3530379845f10be461a66d16d03eca2ded77"
SRC_URI[shlex-1.3.0.sha256sum] = "0fda2ff0d084019ba4d7c6f371c95d8fd75ce3524c3cb8fb653a3023f6323e64"
SRC_URI[signal-hook-0.3.18.sha256sum] = "d881a16cf4426aa584979d30bd82cb33429027e42122b169753d6ef1085ed6e2"
SRC_URI[signal-hook-0.4.1.sha256sum] = "2a37d01603c37b5466f808de79f845c7116049b0579adb70a6b7d47c1fa3a952"
SRC_URI[signal-hook-registry-1.4.8.sha256sum] = "c4db69cba1110affc0e9f7bcd48bbf87b3f4fc7c61fc9155afd4c469eb3d6c1b"
SRC_URI[simd-adler32-0.3.8.sha256sum] = "e320a6c5ad31d271ad523dcf3ad13e2767ad8b1cb8f047f75a8aeaf8da139da2"
SRC_URI[similar-2.7.0.sha256sum] = "bbbb5d9659141646ae647b42fe094daf6c6192d1620870b449d9557f748b2daa"
SRC_URI[slab-0.4.11.sha256sum] = "7a2ae44ef20feb57a68b23d846850f861394c2e02dc425a50098ae8c90267589"
SRC_URI[smallvec-1.15.1.sha256sum] = "67b1b7a3b5fe4f1376887184045fcf45c69e92af734b7aaddc05fb777b6fbd03"
SRC_URI[smol_str-0.3.2.sha256sum] = "9676b89cd56310a87b93dec47b11af744f34d5fc9f367b829474eec0a891350d"
SRC_URI[socket2-0.6.1.sha256sum] = "17129e116933cf371d018bb80ae557e889637989d8638274fb25622827b03881"
SRC_URI[spdx-0.13.3.sha256sum] = "afd765179d12cdd06192e02b1d8c6b0d46bd26de9bf16ce04c881428ca2cc7ed"
SRC_URI[stable_deref_trait-1.2.1.sha256sum] = "6ce2be8dc25455e1f91df71bfa12ad37d7af1092ae736f3a6cd0e37bc7810596"
SRC_URI[static_assertions-1.1.0.sha256sum] = "a2eb9349b6444b326872e140eb1cf5e7c522154d69e7a0ffb0fb81c06b37543f"
SRC_URI[strsim-0.11.1.sha256sum] = "7da8b5736845d9f2fcb837ea5d9e2628564b3b043a70948a3f0b778838c5fb4f"
SRC_URI[strum-0.27.2.sha256sum] = "af23d6f6c1a224baef9d3f61e287d2761385a5b88fdab4eb4c6f11aeb54c4bcf"
SRC_URI[strum_macros-0.27.2.sha256sum] = "7695ce3845ea4b33927c055a39dc438a45b059f7c1b3d91d38d10355fb8cbca7"
SRC_URI[subtle-2.6.1.sha256sum] = "13c2bddecc57b384dee18652358fb23172facb8a2c51ccc10d74c157bdea3292"
SRC_URI[syn-2.0.114.sha256sum] = "d4d107df263a3013ef9b1879b0df87d706ff80f65a86ea879bd9c31f9b307c2a"
SRC_URI[sync_wrapper-1.0.2.sha256sum] = "0bf256ce5efdfa370213c1dabab5935a12e49f2c58d15e9eac2870d3b4f27263"
SRC_URI[synstructure-0.13.2.sha256sum] = "728a70f3dbaf5bab7f0c4b1ac8d7ae5ea60a4b5549c8a5914361c99147a709d2"
SRC_URI[tame-index-0.26.0.sha256sum] = "502c6b412fa8aa4d46f6fee23bba6cab4d260e459226c23a5f936c5f172039ec"
SRC_URI[tap-1.0.1.sha256sum] = "55937e1799185b12863d447f42597ed69d9928686b8d88a1df17376a097d8369"
SRC_URI[target-lexicon-0.13.3.sha256sum] = "df7f62577c25e07834649fc3b39fafdc597c0a3527dc1c60129201ccfcbaa50c"
SRC_URI[tempfile-3.24.0.sha256sum] = "655da9c7eb6305c55742045d5a8d2037996d61d8de95806335c7c86ce0f82e9c"
SRC_URI[termcolor-1.4.1.sha256sum] = "06794f8f6c5c898b3275aebefa6b8a1cb24cd2c6c79397ab15774837a0bc5755"
SRC_URI[thiserror-1.0.69.sha256sum] = "b6aaf5339b578ea85b50e080feb250a3e8ae8cfcdff9a461c9ec2904bc923f52"
SRC_URI[thiserror-2.0.17.sha256sum] = "f63587ca0f12b72a0600bcba1d40081f830876000bb46dd2337a3051618f4fc8"
SRC_URI[thiserror-impl-1.0.69.sha256sum] = "4fee6c4efc90059e10f81e6d42c60a18f76588c3d74cb83a0b242a2b6c7504c1"
SRC_URI[thiserror-impl-2.0.17.sha256sum] = "3ff15c8ecd7de3849db632e14d18d2571fa09dfc5ed93479bc4485c7a517c913"
SRC_URI[time-0.3.44.sha256sum] = "91e7d9e3bb61134e77bde20dd4825b97c010155709965fedf0f49bb138e52a9d"
SRC_URI[time-core-0.1.6.sha256sum] = "40868e7c1d2f0b8d73e4a8c7f0ff63af4f6d19be117e90bd73eb1d62cf831c6b"
SRC_URI[time-macros-0.2.24.sha256sum] = "30cfb0125f12d9c277f35663a0a33f8c30190f4e4574868a330595412d34ebf3"
SRC_URI[tinystr-0.8.2.sha256sum] = "42d3e9c45c09de15d06dd8acf5f4e0e399e85927b7f00711024eb7ae10fa4869"
SRC_URI[tinyvec-1.10.0.sha256sum] = "bfa5fdc3bce6191a1dbc8c02d5c8bffcf557bafa17c124c5264a458f1b0613fa"
SRC_URI[tinyvec_macros-0.1.1.sha256sum] = "1f3ccbac311fea05f86f61904b462b55fb3df8837a366dfc601a0161d0532f20"
SRC_URI[tokio-1.49.0.sha256sum] = "72a2903cd7736441aac9df9d7688bd0ce48edccaadf181c3b90be801e81d3d86"
SRC_URI[tokio-rustls-0.26.4.sha256sum] = "1729aa945f29d91ba541258c8df89027d5792d85a8841fb65e8bf0f4ede4ef61"
SRC_URI[tokio-util-0.7.18.sha256sum] = "9ae9cec805b01e8fc3fd2fe289f89149a9b66dd16786abd8b19cfa7b48cb0098"
SRC_URI[toml-0.9.10+spec-1.1.0.sha256sum] = "0825052159284a1a8b4d6c0c86cbc801f2da5afd2b225fa548c72f2e74002f48"
SRC_URI[toml-span-0.6.0.sha256sum] = "5c6532e5b62b652073bff0e2050ef57e4697a853be118d6c57c32b59fffdeaab"
SRC_URI[toml_datetime-0.7.5+spec-1.1.0.sha256sum] = "92e1cfed4a3038bc5a127e35a2d360f145e1f4b971b551a2ba5fd7aedf7e1347"
SRC_URI[toml_parser-1.0.6+spec-1.1.0.sha256sum] = "a3198b4b0a8e11f09dd03e133c0280504d0801269e9afa46362ffde1cbeebf44"
SRC_URI[toml_writer-1.0.6+spec-1.1.0.sha256sum] = "ab16f14aed21ee8bfd8ec22513f7287cd4a91aa92e44edfe2c17ddd004e92607"
SRC_URI[tower-0.5.2.sha256sum] = "d039ad9159c98b70ecfd540b2573b97f7f52c3e8d9f8ad57a24b916a536975f9"
SRC_URI[tower-http-0.6.8.sha256sum] = "d4e6559d53cc268e5031cd8429d05415bc4cb4aefc4aa5d6cc35fbf5b924a1f8"
SRC_URI[tower-layer-0.3.3.sha256sum] = "121c2a6cda46980bb0fcd1647ffaf6cd3fc79a013de288782836f6df9c48780e"
SRC_URI[tower-service-0.3.3.sha256sum] = "8df9b6e13f2d32c91b9bd719c00d1958837bc7dec474d94952798cc8e69eeec3"
SRC_URI[tracing-0.1.44.sha256sum] = "63e71662fa4b2a2c3a26f570f037eb95bb1f85397f3cd8076caed2f026a6d100"
SRC_URI[tracing-core-0.1.36.sha256sum] = "db97caf9d906fbde555dd62fa95ddba9eecfd14cb388e4f491a66d74cd5fb79a"
SRC_URI[try-lock-0.2.5.sha256sum] = "e421abadd41a4225275504ea4d6566923418b7f05506fbc9c0fe86ba7396114b"
SRC_URI[twox-hash-2.1.2.sha256sum] = "9ea3136b675547379c4bd395ca6b938e5ad3c3d20fad76e7fe85f9e0d011419c"
SRC_URI[typenum-1.19.0.sha256sum] = "562d481066bde0658276a35467c4af00bdc6ee726305698a55b86e61d7ad82bb"
SRC_URI[unicode-bom-2.0.3.sha256sum] = "7eec5d1121208364f6793f7d2e222bf75a915c19557537745b195b253dd64217"
SRC_URI[unicode-ident-1.0.22.sha256sum] = "9312f7c4f6ff9069b165498234ce8be658059c6728633667c526e27dc2cf1df5"
SRC_URI[unicode-normalization-0.1.25.sha256sum] = "5fd4f6878c9cb28d874b009da9e8d183b5abc80117c40bbd187a1fde336be6e8"
SRC_URI[unicode-width-0.2.2.sha256sum] = "b4ac048d71ede7ee76d585517add45da530660ef4390e49b098733c6e897f254"
SRC_URI[untrusted-0.9.0.sha256sum] = "8ecb6da28b8a351d773b68d5825ac39017e680750f980f3a1a85cd8dd28a47c1"
SRC_URI[url-2.5.8.sha256sum] = "ff67a8a4397373c3ef660812acab3268222035010ab8680ec4215f38ba3d0eed"
SRC_URI[utf8_iter-1.0.4.sha256sum] = "b6c140620e7ffbb22c2dee59cafe6084a59b5ffc27a8859a5f0d494b5d52b6be"
SRC_URI[utf8parse-0.2.2.sha256sum] = "06abde3611657adf66d383f00b093d7faecc7fa57071cce2578660c9f1010821"
SRC_URI[version_check-0.9.5.sha256sum] = "0b928f33d975fc6ad9f86c8f283853ad26bdd5b10b7f1542aa2fa15e2289105a"
SRC_URI[walkdir-2.5.0.sha256sum] = "29790946404f91d9c5d06f9874efddea1dc06c5efe94541a7d6863108e3a5e4b"
SRC_URI[want-0.3.1.sha256sum] = "bfa7760aed19e106de2c7c0b581b509f2f25d3dacaf737cb82ac61bc6d760b0e"
SRC_URI[wasi-0.11.1+wasi-snapshot-preview1.sha256sum] = "ccf3ec651a847eb01de73ccad15eb7d99f80485de043efb2f370cd654f4ea44b"
SRC_URI[wasip2-1.0.1+wasi-0.2.4.sha256sum] = "0562428422c63773dad2c345a1882263bbf4d65cf3f42e90921f787ef5ad58e7"
SRC_URI[wasm-bindgen-0.2.106.sha256sum] = "0d759f433fa64a2d763d1340820e46e111a7a5ab75f993d1852d70b03dbb80fd"
SRC_URI[wasm-bindgen-futures-0.4.56.sha256sum] = "836d9622d604feee9e5de25ac10e3ea5f2d65b41eac0d9ce72eb5deae707ce7c"
SRC_URI[wasm-bindgen-macro-0.2.106.sha256sum] = "48cb0d2638f8baedbc542ed444afc0644a29166f1595371af4fecf8ce1e7eeb3"
SRC_URI[wasm-bindgen-macro-support-0.2.106.sha256sum] = "cefb59d5cd5f92d9dcf80e4683949f15ca4b511f4ac0a6e14d4e1ac60c6ecd40"
SRC_URI[wasm-bindgen-shared-0.2.106.sha256sum] = "cbc538057e648b67f72a982e708d485b2efa771e1ac05fec311f9f63e5800db4"
SRC_URI[web-sys-0.3.83.sha256sum] = "9b32828d774c412041098d182a8b38b16ea816958e07cf40eec2bc080ae137ac"
SRC_URI[webpki-root-certs-1.0.5.sha256sum] = "36a29fc0408b113f68cf32637857ab740edfafdf460c326cd2afaa2d84cc05dc"
SRC_URI[webpki-roots-1.0.5.sha256sum] = "12bed680863276c63889429bfd6cab3b99943659923822de1c8a39c49e4d722c"
SRC_URI[winapi-0.3.9.sha256sum] = "5c839a674fcd7a98952e593242ea400abe93992746761e38641405d28b00f419"
SRC_URI[winapi-i686-pc-windows-gnu-0.4.0.sha256sum] = "ac3b87c63620426dd9b991e5ce0329eff545bccbbb34f3be09ff6fb6ab51b7b6"
SRC_URI[winapi-util-0.1.11.sha256sum] = "c2a7b1c03c876122aa43f3020e6c3c3ee5c05081c9a00739faf7503aeba10d22"
SRC_URI[winapi-x86_64-pc-windows-gnu-0.4.0.sha256sum] = "712e227841d057c1ee1cd2fb22fa7e5a5461ae8e48fa2ca79ec42cfc1931183f"
SRC_URI[windows-link-0.2.1.sha256sum] = "f0805222e57f7521d6a62e36fa9163bc891acd422f971defe97d64e70d0a4fe5"
SRC_URI[windows-sys-0.45.0.sha256sum] = "75283be5efb2831d37ea142365f009c02ec203cd29a3ebecbc093d52315b66d0"
SRC_URI[windows-sys-0.52.0.sha256sum] = "282be5f36a8ce781fad8c8ae18fa3f9beff57ec1b52cb3de0789201425d9a33d"
SRC_URI[windows-sys-0.59.0.sha256sum] = "1e38bc4d79ed67fd075bcc251a1c39b32a1776bbe92e5bef1f0bf1f8c531853b"
SRC_URI[windows-sys-0.60.2.sha256sum] = "f2f500e4d28234f72040990ec9d39e3a6b950f9f22d3dba18416c35882612bcb"
SRC_URI[windows-sys-0.61.2.sha256sum] = "ae137229bcbd6cdf0f7b80a31df61766145077ddf49416a728b02cb3921ff3fc"
SRC_URI[windows-targets-0.42.2.sha256sum] = "8e5180c00cd44c9b1c88adb3693291f1cd93605ded80c250a75d472756b4d071"
SRC_URI[windows-targets-0.52.6.sha256sum] = "9b724f72796e036ab90c1021d4780d4d3d648aca59e491e6b98e725b84e99973"
SRC_URI[windows-targets-0.53.5.sha256sum] = "4945f9f551b88e0d65f3db0bc25c33b8acea4d9e41163edf90dcd0b19f9069f3"
SRC_URI[windows_aarch64_gnullvm-0.42.2.sha256sum] = "597a5118570b68bc08d8d59125332c54f1ba9d9adeedeef5b99b02ba2b0698f8"
SRC_URI[windows_aarch64_gnullvm-0.52.6.sha256sum] = "32a4622180e7a0ec044bb555404c800bc9fd9ec262ec147edd5989ccd0c02cd3"
SRC_URI[windows_aarch64_gnullvm-0.53.1.sha256sum] = "a9d8416fa8b42f5c947f8482c43e7d89e73a173cead56d044f6a56104a6d1b53"
SRC_URI[windows_aarch64_msvc-0.42.2.sha256sum] = "e08e8864a60f06ef0d0ff4ba04124db8b0fb3be5776a5cd47641e942e58c4d43"
SRC_URI[windows_aarch64_msvc-0.52.6.sha256sum] = "09ec2a7bb152e2252b53fa7803150007879548bc709c039df7627cabbd05d469"
SRC_URI[windows_aarch64_msvc-0.53.1.sha256sum] = "b9d782e804c2f632e395708e99a94275910eb9100b2114651e04744e9b125006"
SRC_URI[windows_i686_gnu-0.42.2.sha256sum] = "c61d927d8da41da96a81f029489353e68739737d3beca43145c8afec9a31a84f"
SRC_URI[windows_i686_gnu-0.52.6.sha256sum] = "8e9b5ad5ab802e97eb8e295ac6720e509ee4c243f69d781394014ebfe8bbfa0b"
SRC_URI[windows_i686_gnu-0.53.1.sha256sum] = "960e6da069d81e09becb0ca57a65220ddff016ff2d6af6a223cf372a506593a3"
SRC_URI[windows_i686_gnullvm-0.52.6.sha256sum] = "0eee52d38c090b3caa76c563b86c3a4bd71ef1a819287c19d586d7334ae8ed66"
SRC_URI[windows_i686_gnullvm-0.53.1.sha256sum] = "fa7359d10048f68ab8b09fa71c3daccfb0e9b559aed648a8f95469c27057180c"
SRC_URI[windows_i686_msvc-0.42.2.sha256sum] = "44d840b6ec649f480a41c8d80f9c65108b92d89345dd94027bfe06ac444d1060"
SRC_URI[windows_i686_msvc-0.52.6.sha256sum] = "240948bc05c5e7c6dabba28bf89d89ffce3e303022809e73deaefe4f6ec56c66"
SRC_URI[windows_i686_msvc-0.53.1.sha256sum] = "1e7ac75179f18232fe9c285163565a57ef8d3c89254a30685b57d83a38d326c2"
SRC_URI[windows_x86_64_gnu-0.42.2.sha256sum] = "8de912b8b8feb55c064867cf047dda097f92d51efad5b491dfb98f6bbb70cb36"
SRC_URI[windows_x86_64_gnu-0.52.6.sha256sum] = "147a5c80aabfbf0c7d901cb5895d1de30ef2907eb21fbbab29ca94c5b08b1a78"
SRC_URI[windows_x86_64_gnu-0.53.1.sha256sum] = "9c3842cdd74a865a8066ab39c8a7a473c0778a3f29370b5fd6b4b9aa7df4a499"
SRC_URI[windows_x86_64_gnullvm-0.42.2.sha256sum] = "26d41b46a36d453748aedef1486d5c7a85db22e56aff34643984ea85514e94a3"
SRC_URI[windows_x86_64_gnullvm-0.52.6.sha256sum] = "24d5b23dc417412679681396f2b49f3de8c1473deb516bd34410872eff51ed0d"
SRC_URI[windows_x86_64_gnullvm-0.53.1.sha256sum] = "0ffa179e2d07eee8ad8f57493436566c7cc30ac536a3379fdf008f47f6bb7ae1"
SRC_URI[windows_x86_64_msvc-0.42.2.sha256sum] = "9aec5da331524158c6d1a4ac0ab1541149c0b9505fde06423b02f5ef0106b9f0"
SRC_URI[windows_x86_64_msvc-0.52.6.sha256sum] = "589f6da84c646204747d1270a2a5661ea66ed1cced2631d546fdfb155959f9ec"
SRC_URI[windows_x86_64_msvc-0.53.1.sha256sum] = "d6bbff5f0aada427a1e5a6da5f1f98158182f26556f345ac9e04d36d0ebed650"
SRC_URI[winnow-0.7.14.sha256sum] = "5a5364e9d77fcdeeaa6062ced926ee3381faa2ee02d3eb83a5c27a8825540829"
SRC_URI[wit-bindgen-0.46.0.sha256sum] = "f17a85883d4e6d00e8a97c586de764dabcc06133f7f1d55dce5cdc070ad7fe59"
SRC_URI[writeable-0.6.2.sha256sum] = "9edde0db4769d2dc68579893f2306b26c6ecfbe0ef499b013d731b7b9247e0b9"
SRC_URI[wyz-0.5.1.sha256sum] = "05f360fc0b24296329c78fda852a1e9ae82de9cf7b27dae4b7f62f118f77b9ed"
SRC_URI[yoke-0.8.1.sha256sum] = "72d6e5c6afb84d73944e5cedb052c4680d5657337201555f9f2a16b7406d4954"
SRC_URI[yoke-derive-0.8.1.sha256sum] = "b659052874eb698efe5b9e8cf382204678a0086ebf46982b79d6ca3182927e5d"
SRC_URI[zerofrom-0.1.6.sha256sum] = "50cc42e0333e05660c3587f3bf9d0478688e15d870fab3346451ce7f8c9fbea5"
SRC_URI[zerofrom-derive-0.1.6.sha256sum] = "d71e5d6e06ab090c67b5e44993ec16b72dcbaabc526db883a360057678b48502"
SRC_URI[zeroize-1.8.2.sha256sum] = "b97154e67e32c85465826e8bcc1c59429aaaf107c1e4a9e53c8d8ccd5eff88d0"
SRC_URI[zerotrie-0.2.3.sha256sum] = "2a59c17a5562d507e4b54960e8569ebee33bee890c70aa3fe7b97e85a9fd7851"
SRC_URI[zerovec-0.11.5.sha256sum] = "6c28719294829477f525be0186d13efa9a3c602f7ec202ca9e353d310fb9a002"
SRC_URI[zerovec-derive-0.11.2.sha256sum] = "eadce39539ca5cb3985590102671f2567e659fca9666581ad3411d59207951f3"
SRC_URI[zlib-rs-0.5.5.sha256sum] = "40990edd51aae2c2b6907af74ffb635029d5788228222c4bb811e9351c0caad3"
SRC_URI[zmij-1.0.12.sha256sum] = "2fc5a66a20078bf1251bde995aa2fdcc4b800c70b5d92dd2c62abc5c60f679f8"
SRC_URI[zstd-0.13.3.sha256sum] = "e91ee311a569c327171651566e07972200e76fcfe2242a4fa446149a3881c08a"
SRC_URI[zstd-safe-7.2.4.sha256sum] = "8f49c4d5f0abb602a93fb8736af2a4f4dd9512e36f7f570d66e65ff867ed3b9d"
SRC_URI[zstd-sys-2.0.16+zstd.1.5.7.sha256sum] = "91e19ebc2adc8f83e43039e79776e3fda8ca919132d68a1fed6a5faca2683748"

SRC_URI = "gitsm://github.com/EmbarkStudios/cargo-deny;protocol=https;branch=main"
SRC_URI:append = " ${CRATES_LIST}"
SRCREV = "09faadcea2d0d1742492e6872b743d1e4d151a27"
SRCREV_advisory-db = "c9e6bf916e5979334eefc63a6cba44a880c12654"

inherit cargo
inherit cargo-update-recipe-crates
inherit github-releases
inherit sca-description
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "cargodeny"

# nooelint: oelint.vars.insaneskip
INSANE_SKIP:${PN} += "already-stripped"
