# Main features

* `SCA_BACKTRACK` tracks findings from image back to their original recipes
* `SCA_VERBOSE_OUTPUT` will now print directly to build console
* all modules are now checked on a daily basis (hard CI check)
* gosec is working again
* inspec - a very decent compliance tool to check you overall system for compliance and security
* licensecheck now works on a package basis, so licensing issues will be reported correctly
* sca is now using sstate cache, so even if you work on a fresh workspace and with a sstate mirror, you'll have all the findings from the complete stack in one place
* scancode - enhanced license checking

# New

* #2937 - populate sca findings from sstate cache - FEATURE REQUEST
* #3211 - Try InSpec - COMPLIANCE,FEATURE REQUEST,IMAGE/SYSTEM,SECURITY
* #3232 - Translate image findings back to the original packages - FEATURE REQUEST,ENHANCEMENT
* #696 - scancode-toolkit - FEATURE REQUEST

# Updates

* #1604 - Update github.com-lib-pq-native to 1.9.0 - PACKAGE UPDATE
* #3054 - Update python3-packaging-native to 20.8 - PACKAGE UPDATE
* #3060 - Update phan-native to 3.2.6 - PACKAGE UPDATE
* #3065 - Update github.com-go-check-check-native to 10cb98267c6cb43ea9cd6793f29ff4089c306974 - PACKAGE UPDATE
* #3074 - Update checkbashism-native to 2.20.5 - PACKAGE UPDATE
* #3075 - Update python3-pylazy-object-proxy-native to 1.5.2 - PACKAGE UPDATE
* #3076 - Update perl-ppix-regexp-native to 0.076 - PACKAGE UPDATE
* #3077 - Update npm-spdx-license-ids-native to 3.0.7 - PACKAGE UPDATE
* #3078 - Update python3-systemdlint-native to 1.1.16 - PACKAGE UPDATE
* #3079 - Update npm-pyright-native to 1.1.91 - PACKAGE UPDATE
* #3080 - Update npm-chrono-node-native to 2.1.10 - PACKAGE UPDATE
* #3081 - Update python3-flake8-debugger-native to 4.0.0 - PACKAGE UPDATE
* #3082 - Update npm-unist-util-is-native to 4.0.4 - PACKAGE UPDATE
* #3083 - Update phpstan-native to 0.12.58 - PACKAGE UPDATE
* #3084 - Update python3-flake8-print-native to 4.0.0 - PACKAGE UPDATE
* #3085 - Update ruby-simplecov-native to 0.20.0 - PACKAGE UPDATE
* #3086 - Update github.com-briandowns-spinner-native to 1.12.0 - PACKAGE UPDATE
* #3087 - Update npm-caniuse-lite-native to 1.0.30001165 - PACKAGE UPDATE
* #3088 - Update python3-stevedore-native to 3.3.0 - PACKAGE UPDATE
* #3089 - Update npm-electron-to-chromium-native to 1.3.615 - PACKAGE UPDATE
* #3090 - Update npm-postcss-reporter-native to 7.0.2 - PACKAGE UPDATE
* #3091 - Update npm-nanoid-native to 3.1.20 - PACKAGE UPDATE
* #3092 - Update npm-is-bigint-native to 1.0.1 - PACKAGE UPDATE
* #3093 - Update linux-smart-enumeration to 3.0 - PACKAGE UPDATE
* #3094 - Update npm-ansi-styles-native to 5.0.0 - PACKAGE UPDATE
* #3095 - Update npm-object-inspect-native to 1.9.0 - PACKAGE UPDATE
* #3096 - Update python3-wheel-native to 0.36.1 - PACKAGE UPDATE
* #3097 - Update npm-no-case-native to 3.0.4 - PACKAGE UPDATE
* #3098 - Update npm-p-timeout-native to 4.0.0 - PACKAGE UPDATE
* #3099 - Update npm-semver-native to 7.3.4 - PACKAGE UPDATE
* #3100 - Update npm-deep-equal-native to 2.0.5 - PACKAGE UPDATE
* #3101 - Update python3-rich-native to 9.3.0 - PACKAGE UPDATE
* #3102 - Update npm-dot-case-native to 3.0.4 - PACKAGE UPDATE
* #3103 - Update npm-domelementtype-native to 2.1.0 - PACKAGE UPDATE
* #3104 - Update npm-sentence-case-native to 3.0.4 - PACKAGE UPDATE
* #3105 - Update npm-domhandler-native to 4.0.0 - PACKAGE UPDATE
* #3106 - Update npm-param-case-native to 3.0.4 - PACKAGE UPDATE
* #3107 - Update ansible-konstruktoid-ansible-role-hardening to 1.2.0 - PACKAGE UPDATE
* #3108 - Update npm-lower-case-native to 2.0.2 - PACKAGE UPDATE
* #3109 - Update npm-upper-case-first-native to 2.0.2 - PACKAGE UPDATE
* #3110 - Update python3-importlib-metadata-native to 3.1.1 - PACKAGE UPDATE
* #3111 - Update npm-browserslist-native to 4.15.0 - PACKAGE UPDATE
* #3112 - Update npm-hast-util-embedded-native to 1.0.6 - PACKAGE UPDATE
* #3113 - Update github.com-mvdan-sh-native to 3.2.1 - PACKAGE UPDATE
* #3114 - Update npm-is-object-native to 1.0.2 - PACKAGE UPDATE
* #3118 - Update npm-domutils-native to 2.4.3 - PACKAGE UPDATE
* #3119 - Update perl-perl-tidy-native to 20201202 - PACKAGE UPDATE
* #3120 - Update npm-execa-native to 5.0.0 - PACKAGE UPDATE
* #3121 - Update python3-pytype-native to 2020.12.2 - PACKAGE UPDATE
* #3122 - Update github.com-gookit-color-native to 1.3.3 - PACKAGE UPDATE
* #3123 - Update npm-postcss-native to 8.1.14 - PACKAGE UPDATE
* #3124 - Update npm-vue-eslint-parser-native to 7.2.0 - PACKAGE UPDATE
* #3125 - Update python3-ropgadget-native to 6.4 - PACKAGE UPDATE
* #3127 - Update composer-native to 2.0.8 - PACKAGE UPDATE
* #3128 - Update npm-eslint-plugin-vue-native to 7.2.0 - PACKAGE UPDATE
* #3130 - Update npm-cspell-util-bundle-native to 5.0.3 - PACKAGE UPDATE
* #3131 - Update npm-cspell-native to 5.0.3 - PACKAGE UPDATE
* #3132 - Update npm-cspell-trie-native to 5.0.3 - PACKAGE UPDATE
* #3133 - Update npm-cspell-trie-lib-native to 5.0.3 - PACKAGE UPDATE
* #3134 - Update npm-cspell-lib-native to 5.0.3 - PACKAGE UPDATE
* #3135 - Update npm-is-arguments-native to 1.1.0 - PACKAGE UPDATE
* #3136 - Update npm-pyright-native to 1.1.92 - PACKAGE UPDATE
* #3137 - Update npm-electron-to-chromium-native to 1.3.616 - PACKAGE UPDATE
* #3138 - Update npm-is-negative-zero-native to 2.0.1 - PACKAGE UPDATE
* #3140 - Update python3-tqdm-native to 4.54.1 - PACKAGE UPDATE
* #3141 - Update npm-eslint-eslintrc-native to 0.2.2 - PACKAGE UPDATE
* #3142 - Update npm-espree-native to 7.3.1 - PACKAGE UPDATE
* #3144 - Update cppcheck-native to 2.3 - PACKAGE UPDATE
* #3145 - Update npm-dayjs-native to 1.9.7 - PACKAGE UPDATE
* #3146 - Update npm-dom-serializer-native to 1.2.0 - PACKAGE UPDATE
* #3147 - Update npm-is-typed-array-native to 1.1.4 - PACKAGE UPDATE
* #3148 - Update npm-which-typed-array-native to 1.1.4 - PACKAGE UPDATE
* #3149 - Update python3-certifi-native to 2020.12.5 - PACKAGE UPDATE
* #3150 - Update npm-is-boolean-object-native to 1.1.0 - PACKAGE UPDATE
* #3151 - Update npm-core-js-pure-native to 3.8.1 - PACKAGE UPDATE
* #3153 - Update npm-p-timeout-native to 4.0.1 - PACKAGE UPDATE
* #3154 - Update npm-cli-table-native to 0.3.4 - PACKAGE UPDATE
* #3155 - Update npm-vfile-native to 4.2.1 - PACKAGE UPDATE
* #3156 - Update npm-mdast-util-from-markdown-native to 0.8.2 - PACKAGE UPDATE
* #3157 - Update python3-pygments-native to 2.7.3 - PACKAGE UPDATE
* #3158 - Update perl-perl-tidy-native to 20201207 - PACKAGE UPDATE
* #3159 - Update python3-bandit-native to 1.6.3 - PACKAGE UPDATE
* #3160 - Update npm-pyright-native to 1.1.93 - PACKAGE UPDATE
* #3161 - Update npm-write-good-native to 1.0.4 - PACKAGE UPDATE
* #3163 - Update npm-vfile-reporter-native to 6.0.2 - PACKAGE UPDATE
* #3164 - Update phpstan-native to 0.12.62 - PACKAGE UPDATE
* #3165 - Update npm-electron-to-chromium-native to 1.3.620 - PACKAGE UPDATE
* #3166 - Update npm-js-yaml-native to 3.14.1 - PACKAGE UPDATE
* #3168 - Update npm-retire-native to 2.2.4 - PACKAGE UPDATE
* #3169 - Update npm-domutils-native to 2.4.4 - PACKAGE UPDATE
* #3170 - Update npm-xregexp-native to 4.4.1 - PACKAGE UPDATE
* #3171 - Update npm-htmlparser2-native to 6.0.0 - PACKAGE UPDATE
* #3172 - Update npm-autoprefixer-native to 10.1.0 - PACKAGE UPDATE
* #3173 - Update npm-postcss-native to 8.2.0 - PACKAGE UPDATE
* #3174 - Update npm-mdast-util-from-markdown-native to 0.8.4 - PACKAGE UPDATE
* #3175 - Update python3-pyenchant-native to 3.2.0 - PACKAGE UPDATE
* #3177 - Update npm-ms-native to 2.1.3 - PACKAGE UPDATE
* #3178 - Update npm-globals-native to 13.4.0 - PACKAGE UPDATE
* #3179 - Update npm-micromark-native to 2.11.0 - PACKAGE UPDATE
* #3180 - Update npm-types-node-native to 14.14.11 - PACKAGE UPDATE
* #3181 - Update perl-en-lingua-inflect-native to 1.905 - PACKAGE UPDATE
* #3182 - Update npm-cacheable-lookup-native to 5.0.4 - PACKAGE UPDATE
* #3184 - Update github.com-mozilla-tls-observatory-native to 0547674fceff5d5b7a617d4c2014ce6fded87cee - PACKAGE UPDATE
* #3185 - Update npm-ini-native to 1.3.6 - PACKAGE UPDATE
* #3186 - Update python3-cryptography to 3.3 - PACKAGE UPDATE
* #3187 - Update npm-uuid-native to 8.3.2 - PACKAGE UPDATE
* #3188 - Update npm-postcss-native to 8.2.1 - PACKAGE UPDATE
* #3189 - Update npm-micromark-native to 2.11.2 - PACKAGE UPDATE
* #3191 - Update npm-mdast-util-to-markdown-native to 0.6.0 - PACKAGE UPDATE
* #3192 - Update npm-fimbul-wotan-native to 0.22.0 - PACKAGE UPDATE
* #3193 - Update npm-fimbul-ymir-native to 0.22.0 - PACKAGE UPDATE
* #3194 - Update npm-fimbul-valtyr-native to 0.22.0 - PACKAGE UPDATE
* #3195 - Update npm-remark-stringify-native to 9.0.1 - PACKAGE UPDATE
* #3196 - Update npm-debug-native to 4.3.2 - PACKAGE UPDATE
* #3197 - Update npm-electron-to-chromium-native to 1.3.621 - PACKAGE UPDATE
* #3198 - Update npm-fimbul-bifrost-native to 0.22.0 - PACKAGE UPDATE
* #3199 - Update npm-fimbul-ve-native to 0.22.0 - PACKAGE UPDATE
* #3200 - Update npm-babel-parser-native to 7.12.10 - PACKAGE UPDATE
* #3201 - Update npm-babel-helper-get-function-arity-native to 7.12.10 - PACKAGE UPDATE
* #3202 - Update npm-pyright-native to 1.1.94 - PACKAGE UPDATE
* #3203 - Update npm-babel-traverse-native to 7.12.10 - PACKAGE UPDATE
* #3204 - Update python3-testfixtures-native to 6.16.0 - PACKAGE UPDATE
* #3205 - Update npm-babel-core-native to 7.12.10 - PACKAGE UPDATE
* #3206 - Update python3-cryptography to 3.3.1 - PACKAGE UPDATE
* #3207 - Update npm-babel-generator-native to 7.12.10 - PACKAGE UPDATE
* #3208 - Update npm-babel-types-native to 7.12.10 - PACKAGE UPDATE
* #3209 - Update npm-babel-helper-optimise-call-expression-native to 7.12.10 - PACKAGE UPDATE
* #3210 - Update npm-ini-native to 1.3.7 - PACKAGE UPDATE
* #3213 - Update npm-types-node-native to 14.14.13 - PACKAGE UPDATE
* #3214 - Update npm-got-native to 11.8.1 - PACKAGE UPDATE
* #3215 - Update npm-browserslist-native to 4.16.0 - PACKAGE UPDATE
* #3216 - Update npm-mdast-util-to-markdown-native to 0.6.1 - PACKAGE UPDATE
* #3217 - Update cbmc-native to cbmc-5.20.1 - PACKAGE UPDATE
* #3218 - Update luarocks-native to 3.5.0 - PACKAGE UPDATE
* #3219 - Update github.com-gookit-color-native to 1.3.5 - PACKAGE UPDATE
* #3220 - Update sudokiller to 134e3d5dd8e74b30592fb5309a9dd791cd19a7af - PACKAGE UPDATE
* #3221 - Update npm-electron-to-chromium-native to 1.3.625 - PACKAGE UPDATE
* #3222 - Update python3-soupsieve-native to 2.1 - PACKAGE UPDATE
* #3223 - Update python3-chardet-native to 4.0.0 - PACKAGE UPDATE
* #3224 - Update proot-native to ab43a25e35586b860d73d11da4c0076e6fe2b427 - PACKAGE UPDATE
* #3225 - Update npm-typescript-native to 4.1.3 - PACKAGE UPDATE
* #3226 - Update npm-ini-native to 2.0.0 - PACKAGE UPDATE
* #3227 - Update python3-py-native to 1.10.0 - PACKAGE UPDATE
* #3228 - Update python3-rich-native to 9.4.0 - PACKAGE UPDATE
* #3229 - Update python3-setuptools-scm-native to 5.0.0 - PACKAGE UPDATE
* #3230 - Update python3-pytest-native to 6.2.0 - PACKAGE UPDATE
* #3231 - Update python3-bandit-native to 1.7.0 - PACKAGE UPDATE
* #3233 - Update npm-json-schema-traverse-native to 1.0.0 - PACKAGE UPDATE
* #3235 - Update python3-wheel-native to 0.36.2 - PACKAGE UPDATE
* #3236 - Update python3-setuptools-scm-native to 5.0.1 - PACKAGE UPDATE
* #3237 - Update npm-pyright-native to 1.1.95 - PACKAGE UPDATE
* #3238 - Update npm-commander-native to 6.2.1 - PACKAGE UPDATE
* #3239 - Update python3-importlib-metadata-native to 3.3.0 - PACKAGE UPDATE
* #3240 - Update npm-is-set-native to 2.0.2 - PACKAGE UPDATE
* #3241 - Update npm-is-map-native to 2.0.2 - PACKAGE UPDATE
* #3243 - Update ruby-psych-native to 3.2.1- - PACKAGE UPDATE
* #3244 - Update npm-vue-eslint-parser-native to 7.3.0 - PACKAGE UPDATE
* #3245 - Update npm-caniuse-lite-native to 1.0.30001166 - PACKAGE UPDATE
* #3246 - Update npm-global-dirs-native to 2.1.0 - PACKAGE UPDATE
* #3247 - Update python3-joblib-native to 1.0.0 - PACKAGE UPDATE
* #3248 - Update npm-supports-color-native to 8.1.0 - PACKAGE UPDATE
* #3249 - Update npm-electron-to-chromium-native to 1.3.627 - PACKAGE UPDATE
* #3250 - Update npm-which-boxed-primitive-native to 1.0.2 - PACKAGE UPDATE
* #3251 - Update python3-flake8-executable-native to 2.1.1 - PACKAGE UPDATE
* #3252 - Update npm-cspell-lib-native to 5.0.6 - PACKAGE UPDATE
* #3253 - Update npm-cspell-io-native to 5.0.4 - PACKAGE UPDATE
* #3254 - Update npm-cspell-trie-native to 5.0.5 - PACKAGE UPDATE
* #3255 - Update npm-cspell-native to 5.0.6 - PACKAGE UPDATE
* #3256 - Update sudokiller to f26c90bd958e0f9b80cb4d1f323d39d6395217a7 - PACKAGE UPDATE
* #3257 - Update npm-cspell-trie-lib-native to 5.0.4 - PACKAGE UPDATE
* #3258 - Update npm-cspell-glob-native to 5.0.4 - PACKAGE UPDATE
* #3259 - Update npm-cspell-util-bundle-native to 5.0.5 - PACKAGE UPDATE
* #3260 - Update github.com-frankban-quicktest-native to 1.11.3 - PACKAGE UPDATE
* #3261 - Update npm-types-node-native to 14.14.14 - PACKAGE UPDATE
* #3262 - Update python3-pytest-native to 6.2.1 - PACKAGE UPDATE
* #3263 - Update phpstan-native to 0.12.63 - PACKAGE UPDATE
* #3264 - Update npm-babel-generator-native to 7.12.11 - PACKAGE UPDATE
* #3265 - Update ruby-train-core to 3.4.4 - PACKAGE UPDATE
* #3266 - Update npm-babel-helper-validator-identifier-native to 7.12.11 - PACKAGE UPDATE
* #3268 - Update npm-babel-helper-function-name-native to 7.12.11 - PACKAGE UPDATE
* #3269 - Update ruby-train to 3.4.4 - PACKAGE UPDATE
* #3270 - Update inspec-ssh-baseline to 2.6.1 - PACKAGE UPDATE
* #3271 - Update npm-babel-helper-split-export-declaration-native to 7.12.11 - PACKAGE UPDATE
* #3272 - Update ruby-aws-partitions to 1.407.0 - PACKAGE UPDATE
* #3273 - Update npm-babel-helper-replace-supers-native to 7.12.11 - PACKAGE UPDATE
* #3274 - Update npm-babel-parser-native to 7.12.11 - PACKAGE UPDATE
* #3276 - Update npm-babel-types-native to 7.12.11 - PACKAGE UPDATE
* #3277 - Update ruby-google-api-client to 0.52.0 - PACKAGE UPDATE
* #3279 - Update ruby-aws-sdk-ec2 to 1.217.0 - PACKAGE UPDATE
* #3280 - Update ruby-json to 2.4.0- - PACKAGE UPDATE
* #3281 - Update ruby-aws-sdk-s3 to 1.86.2 - PACKAGE UPDATE
* #3282 - Update npm-ajv-keywords-native to 4.0.0 - PACKAGE UPDATE
* #3283 - Update ruby-aws-sdk-lambda to 1.57.0 - PACKAGE UPDATE
* #3284 - Update npm-ajv-native to 7.0.0 - PACKAGE UPDATE
* #3285 - Update npm-babel-code-frame-native to 7.12.11 - PACKAGE UPDATE
* #3286 - Update ruby-aws-sdk-ssm to 1.100.0 - PACKAGE UPDATE
* #3288 - Update ruby-tty-prompt to 0.23.0 - PACKAGE UPDATE
* #3290 - Update npm-caniuse-lite-native to 1.0.30001168 - PACKAGE UPDATE
* #3291 - Update npm-eslint-plugin-vue-native to 7.3.0 - PACKAGE UPDATE
* #3292 - Update python3-testfixtures-native to 6.17.0 - PACKAGE UPDATE
* #3294 - Update npm-cspell-native to 5.0.8 - PACKAGE UPDATE
* #3295 - Update npm-cspell-lib-native to 5.0.8 - PACKAGE UPDATE
* #3296 - Update npm-ajv-native to 7.0.1 - PACKAGE UPDATE
* #3297 - Update npm-electron-to-chromium-native to 1.3.629 - PACKAGE UPDATE
* #3298 - Update python3-pytype-native to 2020.12.16 - PACKAGE UPDATE
* #3299 - Update ruby-tzinfo to 2.0.4 - PACKAGE UPDATE
* #3300 - Update inspec-linux-baseline to 2.6.0 - PACKAGE UPDATE
* #3301 - Update ruby-aws-partitions to 1.408.0 - PACKAGE UPDATE
* #3302 - Update python3-requests-native to 2.25.1 - PACKAGE UPDATE
* #3303 - Update npm-jsx-ast-utils-native to 3.2.0 - PACKAGE UPDATE
* #3304 - Update ruby-json to 2.4.1 - PACKAGE UPDATE
* #3308 - Update npm-vscode-uri-native to 3.0.0 - PACKAGE UPDATE
* #3309 - Update npm-cspell-trie-lib-native to 5.0.8 - PACKAGE UPDATE
* #3310 - Update npm-eslint-plugin-unicorn-native to 24.0.0 - PACKAGE UPDATE
* #3311 - Update npm-cspell-util-bundle-native to 5.0.8 - PACKAGE UPDATE
* #3312 - Update npm-cspell-io-native to 5.0.8 - PACKAGE UPDATE
* #3313 - Update npm-cspell-trie-native to 5.0.8 - PACKAGE UPDATE
* #3314 - Update npm-cspell-glob-native to 5.0.8 - PACKAGE UPDATE
* #3316 - Update ruby-aws-sdk-ec2 to 1.219.0 - PACKAGE UPDATE
* #3318 - Update ruby-aws-sdk-sqs to 1.35.0 - PACKAGE UPDATE
* #3319 - Update ruby-aws-sdk-configservice to 1.54.0 - PACKAGE UPDATE
* #3320 - Update ruby-aws-sdk-kms to 1.40.0 - PACKAGE UPDATE
* #3321 - Update ruby-aws-sdk-route53resolver to 1.22.0 - PACKAGE UPDATE
* #3322 - Update ruby-aws-sdk-route53 to 1.45.0 - PACKAGE UPDATE
* #3323 - Update npm-get-intrinsic-native to 1.0.2 - PACKAGE UPDATE
* #3329 - Update ruby-docile-native to 1.3.3 - PACKAGE UPDATE
* #3330 - Update python3-rich-native to 9.5.1 - PACKAGE UPDATE
* #3331 - Update npm-vscode-uri-native to 3.0.1 - PACKAGE UPDATE
* #3332 - Update npm-eslint-native to 7.16.0 - PACKAGE UPDATE
* #3333 - Update ruby-ffi to 1.14.1 - PACKAGE UPDATE
* #3334 - Update ruby-aws-partitions to 1.410.0 - PACKAGE UPDATE
* #3335 - Update ruby-aws-sdk-rds to 1.108.0 - PACKAGE UPDATE
* #3341 - Update python3-flake8-comprehensions-native to 3.3.1 - PACKAGE UPDATE
* #3342 - Update npm-ajv-native to 7.0.2 - PACKAGE UPDATE
* #3343 - Update python3-coverage-native to 5.3.1 - PACKAGE UPDATE
* #3344 - Update npm-caniuse-lite-native to 1.0.30001170 - PACKAGE UPDATE
* #3345 - Update npm-globals-native to 13.5.0 - PACKAGE UPDATE
* #3350 - Update ruby-tomlrb to 2.0.1 - PACKAGE UPDATE
* #3351 - Update npm-import-modules-native to 2.1.0 - PACKAGE UPDATE
* #3352 - Update npm-fastq-native to 1.10.0 - PACKAGE UPDATE
* #3358 - Update python3-oelint-parser-native to 1.0.7 - PACKAGE UPDATE
* #3359 - Update python3-safety-native to 1.10.0 - PACKAGE UPDATE
* #3361 - Update ruby-tty-box to 0.7.0 - PACKAGE UPDATE
* #3363 - Update phpstan-native to 0.12.64 - PACKAGE UPDATE
* #3364 - Update ruby-ffi to 1.14.2 - PACKAGE UPDATE
* #3365 - Update npm-electron-to-chromium-native to 1.3.632 - PACKAGE UPDATE
* #3366 - Update ruby-aws-sdk-apigateway to 1.58.0 - PACKAGE UPDATE
* #3368 - Update ruby-aws-sdk-securityhub to 1.37.0 - PACKAGE UPDATE
* #3369 - Update ruby-aws-sdk-ec2 to 1.220.0 - PACKAGE UPDATE
* #3370 - Update ruby-aws-sdk-configservice to 1.55.0 - PACKAGE UPDATE
* #3371 - Update ruby-aws-partitions to 1.412.0 - PACKAGE UPDATE
* #3372 - Update ruby-aws-sdk-s3 to 1.87.0 - PACKAGE UPDATE
* #3373 - Update npm-builtin-modules-native to 3.2.0 - PACKAGE UPDATE
* #3374 - Update ruby-json to 2.5.1 - PACKAGE UPDATE
* #3375 - Update npm-textlint-ast-node-types-native to 4.3.5 - PACKAGE UPDATE
* #3376 - Update npm-textlint-fixer-formatter-native to 3.2.6 - PACKAGE UPDATE
* #3377 - Update npm-textlint-ast-traverse-native to 2.2.6 - PACKAGE UPDATE
* #3378 - Update npm-textlint-module-interop-native to 1.1.5 - PACKAGE UPDATE
* #3379 - Update npm-textlint-feature-flag-native to 3.2.5 - PACKAGE UPDATE
* #3380 - Update npm-textlint-textlint-plugin-markdown-native to 5.2.7 - PACKAGE UPDATE
* #3381 - Update npm-textlint-text-to-ast-native to 3.2.5 - PACKAGE UPDATE
* #3382 - Update npm-eslint-template-visitor-native to 2.2.2 - PACKAGE UPDATE
* #3383 - Update npm-textlint-ast-tester-native to 2.2.5 - PACKAGE UPDATE
* #3384 - Update npm-textlint-native to 11.7.7 - PACKAGE UPDATE
* #3385 - Update npm-textlint-utils-native to 1.1.5 - PACKAGE UPDATE
* #3386 - Update npm-textlint-linter-formatter-native to 3.2.6 - PACKAGE UPDATE
* #3387 - Update npm-textlint-types-native to 1.4.6 - PACKAGE UPDATE
* #3388 - Update ruby-docile-native to 1.3.4 - PACKAGE UPDATE
* #3389 - Update npm-textlint-markdown-to-ast-native to 6.2.6 - PACKAGE UPDATE
* #3390 - Update npm-fraction.js-native to 4.0.13 - PACKAGE UPDATE
* #3391 - Update npm-textlint-kernel-native to 3.3.7 - PACKAGE UPDATE
* #3392 - Update npm-textlint-textlint-plugin-text-native to 4.2.7 - PACKAGE UPDATE
* #3393 - Update ruby-aws-sdk-elasticache to 1.48.0 - PACKAGE UPDATE
* #3394 - Update ruby-aws-sdk-ssm to 1.101.0 - PACKAGE UPDATE
* #3395 - Update ruby-aws-sdk-rds to 1.109.0 - PACKAGE UPDATE
* #3396 - Update npm-pyright-native to 1.1.96 - PACKAGE UPDATE
* #3399 - Update ruby-psych-native to 3.3.0 - PACKAGE UPDATE
* #3400 - Update npm-babel-traverse-native to 7.12.12 - PACKAGE UPDATE
* #3401 - Update npm-babel-types-native to 7.12.12 - PACKAGE UPDATE
* #3402 - Update npm-electron-to-chromium-native to 1.3.633 - PACKAGE UPDATE
* #3403 - Update ruby-faraday to 1.2.0 - PACKAGE UPDATE
* #3404 - Update npm-types-node-native to 14.14.16 - PACKAGE UPDATE
* #3405 - Update ruby-aws-partitions to 1.413.0 - PACKAGE UPDATE
* #3406 - Update python3-pytype-native to 2020.12.23 - PACKAGE UPDATE
* #3408 - Update lynis to 3.0.2 - PACKAGE UPDATE
* #3409 - Update npm-cspell-dict-en-us-native to 1.3.0 - PACKAGE UPDATE
* #3410 - Update npm-cspell-dict-filetypes-native to 1.2.2 - PACKAGE UPDATE
* #3411 - Update npm-cspell-dict-golang-native to 1.2.1 - PACKAGE UPDATE
* #3412 - Update npm-cspell-dict-ruby-native to 1.1.2 - PACKAGE UPDATE
* #3413 - Update npm-cspell-dict-elixir-native to 1.1.2 - PACKAGE UPDATE
* #3414 - Update npm-cspell-dict-scala-native to 1.1.2 - PACKAGE UPDATE
* #3415 - Update npm-cspell-dict-cpp-native to 1.2.2 - PACKAGE UPDATE
* #3416 - Update npm-cspell-dict-haskell-native to 1.1.2 - PACKAGE UPDATE
* #3417 - Update npm-cspell-dict-lorem-ipsum-native to 1.1.2 - PACKAGE UPDATE
* #3418 - Update npm-cspell-dict-css-native to 1.1.2 - PACKAGE UPDATE
* #3419 - Update npm-cspell-dict-cryptocurrencies-native to 1.1.2 - PACKAGE UPDATE
* #3420 - Update npm-cspell-dict-csharp-native to 1.1.2 - PACKAGE UPDATE
* #3421 - Update npm-cspell-dict-lua-native to 1.1.2 - PACKAGE UPDATE
* #3422 - Update npm-cspell-dict-en-gb-native to 1.2.0 - PACKAGE UPDATE
* #3423 - Update npm-cspell-dict-software-terms-native to 1.1.2 - PACKAGE UPDATE
* #3424 - Update npm-cspell-dict-node-native to 1.1.2 - PACKAGE UPDATE
* #3425 - Update npm-cspell-dict-npm-native to 1.1.2 - PACKAGE UPDATE
* #3426 - Update npm-cspell-dict-php-native to 1.1.2 - PACKAGE UPDATE
* #3427 - Update npm-cspell-dict-html-native to 1.2.1 - PACKAGE UPDATE
* #3428 - Update npm-cspell-dict-latex-native to 1.1.2 - PACKAGE UPDATE
* #3429 - Update npm-cspell-dict-fullstack-native to 1.1.2 - PACKAGE UPDATE
* #3430 - Update npm-cspell-dict-python-native to 1.1.2 - PACKAGE UPDATE
* #3431 - Update npm-cspell-dict-rust-native to 1.1.2 - PACKAGE UPDATE
* #3432 - Update npm-cspell-dict-powershell-native to 1.1.2 - PACKAGE UPDATE
* #3433 - Update npm-cspell-dict-bash-native to 1.1.2 - PACKAGE UPDATE
* #3434 - Update npm-cspell-dict-typescript-native to 1.1.2 - PACKAGE UPDATE
* #3435 - Update npm-cspell-dict-aws-native to 1.1.2 - PACKAGE UPDATE
* #3436 - Update npm-cspell-dict-java-native to 1.1.1 - PACKAGE UPDATE
* #3437 - Update npm-cspell-dict-dotnet-native to 1.1.2 - PACKAGE UPDATE
* #3438 - Update npm-cspell-dict-html-symbol-entities-native to 1.1.2 - PACKAGE UPDATE
* #3439 - Update npm-cspell-dict-django-native to 1.1.2 - PACKAGE UPDATE
* #3440 - Update npm-cspell-dict-fonts-native to 1.1.2 - PACKAGE UPDATE
* #3441 - Update npm-cspell-dict-companies-native to 1.1.2 - PACKAGE UPDATE
* #3442 - Update python3-pytz-native to 2020.5 - PACKAGE UPDATE
* #3443 - Update npm-meow-native to 8.1.0 - PACKAGE UPDATE
* #3445 - Update python3-tqdm-native to 4.55.0 - PACKAGE UPDATE
* #3446 - Update ruby-parser-native to 3.0.0.0 - PACKAGE UPDATE
* #3448 - Update npm-p-timeout-native to 4.1.0 - PACKAGE UPDATE
* #3449 - Update npm-mdast-util-to-markdown-native to 0.6.2 - PACKAGE UPDATE
* #3451 - Update github.com-gookit-color-native to 1.3.6 - PACKAGE UPDATE
* #3452 - Update npm-unified-message-control-native to 3.0.2 - PACKAGE UPDATE
* #3453 - Update npm-unified-diff-native to 3.1.0 - PACKAGE UPDATE
* #3454 - Update npm-pyright-native to 1.1.97 - PACKAGE UPDATE
* #3455 - Update npm-dayjs-native to 1.9.8 - PACKAGE UPDATE
* #3456 - Update npm-cspell-lib-native to 5.1.0 - PACKAGE UPDATE
* #3457 - Update npm-cspell-native to 5.1.0 - PACKAGE UPDATE
* #3458 - Update npm-cspell-util-bundle-native to 5.1.0 - PACKAGE UPDATE
* #3459 - Update npm-cspell-io-native to 5.1.0 - PACKAGE UPDATE
* #3460 - Update npm-nodelib-fs.scandir-native to 2.1.4 - PACKAGE UPDATE
* #3461 - Update npm-cspell-cspell-bundled-dicts-native to 5.1.0 - PACKAGE UPDATE
* #3462 - Update npm-nodelib-fs.walk-native to 1.2.5 - PACKAGE UPDATE
* #3463 - Update npm-cspell-trie-lib-native to 5.1.0 - PACKAGE UPDATE
* #3464 - Update npm-cspell-glob-native to 5.1.0 - PACKAGE UPDATE
* #3466 - Update ruby-rspec-expectations to 3.10.1 - PACKAGE UPDATE
* #3467 - Update npm-nodelib-fs.walk-native to 1.2.6 - PACKAGE UPDATE
* #3468 - Update ruby-rspec-core to 3.10.1 - PACKAGE UPDATE
* #3469 - Update ruby-rspec-support to 3.10.1 - PACKAGE UPDATE
* #3470 - Update npm-eslint-plugin-vue-native to 7.4.0 - PACKAGE UPDATE
* #3471 - Update npm-cspell-lib-native to 5.1.1 - PACKAGE UPDATE
* #3472 - Update inspec-linux-baseline to 2.6.1 - PACKAGE UPDATE
* #3473 - Update npm-cspell-util-bundle-native to 5.1.1 - PACKAGE UPDATE
* #3474 - Update npm-cspell-native to 5.1.1 - PACKAGE UPDATE
* #3475 - Update npm-eslint-plugin-unicorn-native to 25.0.1 - PACKAGE UPDATE
* #3476 - Update ruby-rspec-mocks to 3.10.1 - PACKAGE UPDATE
* #3477 - Update python3-jaraco-functools-native to 3.1.0 - PACKAGE UPDATE
* #3478 - Update ruby-aws-sdk-cloudfront to 1.47.0 - PACKAGE UPDATE
* #3479 - Update npm-caniuse-lite-native to 1.0.30001171 - PACKAGE UPDATE
* #3480 - Update npm-boxen-native to 5.0.0 - PACKAGE UPDATE
* #3481 - Update phpcodefixer-native to 2.0.25 - PACKAGE UPDATE
* #3482 - Update ruby-aws-sdk-apigatewayv2 to 1.30.0 - PACKAGE UPDATE
* #3483 - Update npm-side-channel-native to 1.0.4 - PACKAGE UPDATE
* #3484 - Update npm-postcss-native to 8.2.2 - PACKAGE UPDATE
* #3485 - Update npm-eslint-plugin-react-native to 7.22.0 - PACKAGE UPDATE
* #3486 - Update ruby-unicode-display-width to 2.0.0 - PACKAGE UPDATE
* #3487 - Update python3-rich-native to 9.6.0 - PACKAGE UPDATE
* #3488 - Update npm-pyright-native to 1.1.98 - PACKAGE UPDATE
* #3489 - Update npm-types-node-native to 14.14.17 - PACKAGE UPDATE
* #3490 - Update ruby-aws-partitions to 1.414.0 - PACKAGE UPDATE
* #3491 - Update ruby-aws-sdk-elasticache to 1.49.0 - PACKAGE UPDATE
* #3492 - Update python3-typed-ast-native to 1.4.2 - PACKAGE UPDATE
* #3493 - Update python3-isort-native to 5.7.0 - PACKAGE UPDATE
* #3496 - Update ruby-faraday to 1.3.0 - PACKAGE UPDATE
* #3497 - Update npm-cspell-lib-native to 5.1.2 - PACKAGE UPDATE
* #3498 - Update npm-cspell-native to 5.1.2 - PACKAGE UPDATE
* #3499 - Update python3-rich-native to 9.6.1 - PACKAGE UPDATE
* #3500 - Update phan-native to 4.0.1 - PACKAGE UPDATE
* #3501 - Update python3-astpretty-native to 2.1.0 - PACKAGE UPDATE
* #3502 - Update python3-idna-native to 3.0 - PACKAGE UPDATE
* #3506 - Update kconfig-hardened-check-native to 0.5.9 - PACKAGE UPDATE
* #3507 - Update npm-types-node-native to 14.14.19 - PACKAGE UPDATE
* #3508 - Update npm-table-native to 6.0.7 - PACKAGE UPDATE
* #3509 - Update ruby-i18n to 1.8.6 - PACKAGE UPDATE
* #3510 - Update npm-eslint-native to 7.17.0 - PACKAGE UPDATE
* #3511 - Update npm-json-schema-native to 0.3.0 - PACKAGE UPDATE
* #3512 - Update npm-mime-types-native to 2.1.28 - PACKAGE UPDATE
* #3513 - Update npm-ajv-native to 7.0.3 - PACKAGE UPDATE
* #3514 - Update python3-tqdm-native to 4.55.1 - PACKAGE UPDATE
* #3516 - Update npm-astring-native to 1.5.1 - PACKAGE UPDATE
* #3517 - Update npm-dayjs-native to 1.10.1 - PACKAGE UPDATE
* #3518 - Update npm-js-yaml-native to 4.0.0 - PACKAGE UPDATE
* #3519 - Update npm-core-js-pure-native to 3.8.2 - PACKAGE UPDATE
* #3520 - Update python3-safety-native to 1.10.1 - PACKAGE UPDATE
* #3521 - Update ruby-simplecov-native to 0.21.0 - PACKAGE UPDATE
* #3522 - Update npm-pyright-native to 1.1.99 - PACKAGE UPDATE
* #3523 - Update npm-tsutils-native to 3.18.0 - PACKAGE UPDATE
* #3524 - Update npm-caniuse-lite-native to 1.0.30001173 - PACKAGE UPDATE
* #3525 - Update ruby-i18n to 1.8.7 - PACKAGE UPDATE
* #3526 - Update nodejs-native to 12.20.1 - PACKAGE UPDATE
* #3527 - Update npm-astring-native to 1.6.0 - PACKAGE UPDATE
* #3528 - Update python3-idna-native to 3.1 - PACKAGE UPDATE
* #3529 - Update npm-node-releases-native to 1.1.69 - PACKAGE UPDATE
* #3530 - Update ruby-inspec-core to 4.24.26 - PACKAGE UPDATE
* #3531 - Update ruby-inspec to 4.24.26 - PACKAGE UPDATE
* #3532 - Update ruby-simplecov-native to 0.21.1 - PACKAGE UPDATE
* #3533 - Update npm-eslint-plugin-vue-native to 7.4.1 - PACKAGE UPDATE
* #3534 - Update ruby-inspec-bin to 4.24.26 - PACKAGE UPDATE
* #3535 - Update npm-types-node-native to 14.14.20 - PACKAGE UPDATE
* #3536 - Update npm-textlint-rule-stop-words-native to 2.0.8 - PACKAGE UPDATE
* #3537 - Update npm-electron-to-chromium-native to 1.3.634 - PACKAGE UPDATE
* #3538 - Update npm-vscode-uri-native to 3.0.2 - PACKAGE UPDATE
* #3539 - Update npm-cspell-util-bundle-native to 5.1.3 - PACKAGE UPDATE
* #3540 - Update npm-cspell-io-native to 5.1.3 - PACKAGE UPDATE
* #3541 - Update npm-cspell-native to 5.1.3 - PACKAGE UPDATE
* #3542 - Update npm-cspell-trie-lib-native to 5.1.3 - PACKAGE UPDATE
* #3543 - Update npm-cspell-lib-native to 5.1.3 - PACKAGE UPDATE
* #3544 - Update npm-cspell-glob-native to 5.1.3 - PACKAGE UPDATE
* #3546 - Update npm-browserslist-native to 4.16.1 - PACKAGE UPDATE
* #3547 - Update ruby-chef-utils to 16.9.16 - PACKAGE UPDATE
* #3548 - Update npm-tslib-native to 2.1.0 - PACKAGE UPDATE
* #3549 - Update npm-dayjs-native to 1.10.2 - PACKAGE UPDATE
* #3550 - Update ruby-chef-config to 16.9.16 - PACKAGE UPDATE
* #3551 - Update ruby-minitest to 5.14.3 - PACKAGE UPDATE
* #3552 - Update npm-autoprefixer-native to 10.2.0 - PACKAGE UPDATE
* #3553 - Update python3-gitpython-native to 3.1.12 - PACKAGE UPDATE
* #3555 - Update npm-cspell-dict-node-native to 1.1.3 - PACKAGE UPDATE
* #3556 - Update npm-cspell-dict-python-native to 1.1.3 - PACKAGE UPDATE
* #3557 - Update npm-globby-native to 11.0.2 - PACKAGE UPDATE
* #3558 - Update npm-cspell-dict-en-us-native to 1.3.1 - PACKAGE UPDATE
* #3561 - Update npm-cspell-dict-software-terms-native to 1.1.3 - PACKAGE UPDATE
* #3562 - Update npm-tsutils-native to 3.19.0 - PACKAGE UPDATE
* #3563 - Update phpstan-native to 0.12.65 - PACKAGE UPDATE
* #3564 - Update ruby-aws-sdk-autoscaling to 1.53.0 - PACKAGE UPDATE
* #3565 - Update ruby-inspec-bin to 4.24.28 - PACKAGE UPDATE
* #3566 - Update ruby-inspec to 4.24.28 - PACKAGE UPDATE
* #3567 - Update ruby-inspec-core to 4.24.28 - PACKAGE UPDATE
* #3570 - Update npm-postcss-native to 8.2.3 - PACKAGE UPDATE
* #3571 - Update npm-meow-native to 9.0.0 - PACKAGE UPDATE
* #3573 - Update lynis to 3.0.3 - PACKAGE UPDATE
* #3575 - Update cbmc-native to cbmc-5.21.0 - PACKAGE UPDATE

# Bugfixes

* #3116 - get_files_by_glob doesn't return items for directory - BUG
* #3129 - clashes of python3-python-magic-native with other python modules - BUG
* #3289 - inspec requires recipes from meta-oe - BUG
* #3293 - ruby-cross fails on x86 - BUG
* #3306 - rubygems compile error on zeus - BUG
* #3315 - ruby-libyajl2 depends on libgmp - BUG
* #3317 - licensecheck fails to import modules - BUG
* #3325 - ansible.cfg is create in TOPDIR - BUG
* #3326 - ansiblelint falsely taken into account - CI,BUG
* #3327 - ruby-ffi packaging error - BUG
* #3328 - scancode doesn't return a value - BUG
* #3336 - github.com-pkg-diff-native branch got renamed to main - BUG
* #3337 - pytype fails on python 3.9 - BUG
* #3355 - cspell dictionaries can't be found - BUG
* #3356 - licensecheck: check for NoneType - BUG
* #3362 - licensecheck and scancode export wrong buildpath - BUG
* #3450 - checkbashism script uses host sided perl - BUG
* #3554 - licensecheck: how to enable it - BUG
* #3559 - licensecheck: interpretation of results - BUG

# Misc

* #1577 - licensecheck module should mind that packages can have different licenses - COMPLIANCE,ENHANCEMENT
* #2769 - Reenable gosec - ENHANCEMENT
* #3117 - tracefiles module should find cmake style sources - ENHANCEMENT
* #3126 - Remove all python3 < 3.7 compat code - ENHANCEMENT
* #3232 - Translate image findings back to the original packages - FEATURE REQUEST,ENHANCEMENT
* #3340 - Turn bb.note into bb.verbnote to make them visible in console by default - ENHANCEMENT
* #3346 - Replace ${PYTHON_PN} by python3 - ENHANCEMENT
* #3347 - Remove unused recipes in the layer - ENHANCEMENT
* #3407 - Individual stages should have configurable timeouts - CI,ENHANCEMENT
* #3447 - systemdlint recipe mode brings up false positive warnings - ENHANCEMENT

# Thanks

@RobertBerger
